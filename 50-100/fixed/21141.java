@java.lang.Override
public void onStop() {
    super.onStop();
    if (connectionEstablished) {
        removeVideoTrackSListener();
        conversationFragmentCallbackListener.removeRTCClientConnectionCallback(this);
        conversationFragmentCallbackListener.removeRTCSessionUserCallback(this);
        allCallbacksInit = false;
    }else {
        android.util.Log.d(TAG, "We are in dialing process yet!");
    }
}