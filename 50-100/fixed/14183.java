@android.annotation.SuppressLint(value = "NewApi")
@java.lang.Override
public void onDestroy() {
    com.wordpress.ebc81.rtl_ais_android.core.RtlAisJava.stop();
    stopForeground(true);
    com.wordpress.ebc81.rtl_ais_android.tools.LogRtlAis.announceStateChanged(false);
    for (final com.wordpress.ebc81.rtl_ais_android.tools.BinaryRunnerService.ExceptionListener listener : exception_listeners)
        listener.onException(null);
    
    com.wordpress.ebc81.rtl_ais_android.core.RtlAisJava.unregisterWordCallback(callback1);
    try {
        wl.release();
        com.wordpress.ebc81.rtl_ais_android.tools.LogRtlAis.appendLine("Wake lock released");
    } catch (java.lang.Throwable t) {
    }
    super.onDestroy();
}