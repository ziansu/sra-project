public static synchronized me.colinmarsch.simpleweather.simpleweatherapp.Weather getInstance(android.content.Context context) {
    if ((me.colinmarsch.simpleweather.simpleweatherapp.Weather.mInstance) == null) {
        me.colinmarsch.simpleweather.simpleweatherapp.Weather.mInstance = new me.colinmarsch.simpleweather.simpleweatherapp.Weather(context);
    }
    return me.colinmarsch.simpleweather.simpleweatherapp.Weather.mInstance;
}