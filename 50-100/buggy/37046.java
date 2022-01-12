@java.lang.Override
public void onSessionClosed(com.quickblox.videochat.webrtc.QBRTCSession session) {
    if (session.getSessionID().equals(currentSession)) {
        android.util.Log.d(com.quickblox.sample.videochatwebrtcnew.activities.CallActivity.TAG, "Stop session");
        if ((session.getState().ordinal()) > (QBRTCSession.QBRTCSessionState.QB_RTC_SESSION_REJECTED.ordinal())) {
            addOpponentsFragmentWithDelay();
        }else {
            android.util.Log.d(com.quickblox.sample.videochatwebrtcnew.activities.CallActivity.TAG, ("Can't hangup session with status -->" + (session.getState().name())));
        }
        android.util.Log.d(com.quickblox.sample.videochatwebrtcnew.activities.CallActivity.TAG, "Remove current session");
        currentSession = null;
    }
}