@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    try {
        mediaCallback = ((com.BC.entertainment.inter.MediaCallback) (activity));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        com.summer.logger.XLog.e("get switch camera exception");
    }
}