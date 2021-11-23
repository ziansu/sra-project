@java.lang.Override
public void onSessionDestroyed() {
    android.util.Log.v(com.android.bluetooth.avrcp.Avrcp.TAG, "MediaController session destroyed");
    if ((mMediaController) != null) {
        removeMediaController(mMediaController.getWrappedInstance());
        mMediaController.unregisterCallback(mMediaControllerCb);
        mMediaController = null;
    }
}