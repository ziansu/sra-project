@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    try {
        com.BC.entertainment.inter.MediaCallback mediaCallback = ((com.BC.entertainment.inter.MediaCallback) (activity));
        modulePanel.SetMediaCallback(mediaCallback);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        com.summer.logger.XLog.e("get switch camera exception");
    }
}