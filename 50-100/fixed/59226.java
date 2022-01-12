@java.lang.Override
public void onResponse(okhttp3.Call call, okhttp3.Response response) throws java.io.IOException {
    java.lang.String responseText = response.body().string();
    com.coolweather.com.coolweather.gson.Weather weather1 = com.coolweather.com.coolweather.util.Utility.handleWeatherResponse(responseText);
    if ((weather1 != null) && (weather.status.equals("ok"))) {
        android.content.SharedPreferences.Editor editor = android.preference.PreferenceManager.getDefaultSharedPreferences(this).edit();
        editor.putString("weather", responseText);
        editor.apply();
    }
}