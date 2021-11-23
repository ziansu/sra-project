@java.lang.Override
public void onError(int status, java.lang.String error) {
    super.onError(status, error);
    android.util.Log.d(com.ningso.silence.PluginDexManager.TAG, "plugin download error");
    sendBroadcastToAnalytics(com.ningso.silence.PluginDexManager.DOWNLOAD_ERROR, adBean.getPkgName(), 1, error);
}