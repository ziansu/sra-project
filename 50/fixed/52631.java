@java.lang.Override
public void onSessionClosed(com.quickblox.videochat.webrtc.QBRTCSession session) {
    if (session.equals(currentSession)) {
        android.util.Log.d(com.quickblox.sample.videochatwebrtcnew.activities.CallActivity.TAG, "Stop session");
        addOpponentsFragmentWithDelay();
        android.util.Log.d(com.quickblox.sample.videochatwebrtcnew.activities.CallActivity.TAG, "Remove current session");
        currentSession = null;
    }
}