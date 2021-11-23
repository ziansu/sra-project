@java.lang.Override
public void onResponse(okhttp3.Call call, okhttp3.Response response) throws java.io.IOException {
    java.lang.String responseBodyString = response.body().string();
    android.content.SharedPreferences.Editor editor = android.preference.PreferenceManager.getDefaultSharedPreferences(this).edit();
    editor.putString("bingPic", responseBodyString);
    editor.apply();
    android.util.Log.d(cn.androiders.simpleweather.Service.AutoUpdateService.TAG, ("onResponse: " + responseBodyString));
}