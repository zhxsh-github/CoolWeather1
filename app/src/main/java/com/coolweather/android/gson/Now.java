package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zxszx on 2020/3/15.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
