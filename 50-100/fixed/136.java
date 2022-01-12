@java.lang.Override
protected void onPause() {
    android.util.Log.d(com.quickblox.q_municate.ui.mediacall.CallActivity.CALL_INTEGRATION, ("Pause call activity " + (this)));
    super.onPause();
    if ((getLocalVideoView()) != null) {
        getLocalVideoView().onPause();
    }
    if ((getRemoteVideoView()) != null) {
        getRemoteVideoView().onPause();
    }
}