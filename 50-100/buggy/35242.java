@java.lang.Override
public void onResponse(okhttp3.Call call, okhttp3.Response response) throws java.io.IOException {
    if (android.util.Log.isLoggable(VWOLog.UPLOAD_LOGS, Log.VERBOSE)) {
        com.vwo.mobile.utils.VWOLog.v(VWOLog.UPLOAD_LOGS, ("Completed: " + (response.request().url().toString())));
    }
    urls.remove(url);
    mVWO.getVwoPreference().putListString(VWOData.VWO_QUEUE, urls);
}