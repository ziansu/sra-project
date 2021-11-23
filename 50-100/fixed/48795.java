@java.lang.Override
public void onReceiveNewSession(com.quickblox.videochat.webrtc.QBRTCSession session) {
    if ((currentSession) == null) {
        android.util.Log.d(com.quickblox.sample.videochatwebrtcnew.activities.CallActivity.TAG, "Start new session");
        android.util.Log.d(com.quickblox.sample.videochatwebrtcnew.activities.CallActivity.TAG, "Income call");
        com.quickblox.videochat.webrtc.QBRTCClient.getInstance().getSessions().put(session.getSessionID(), session);
        addIncomeCallFragment(session);
    }else {
        android.util.Log.d(com.quickblox.sample.videochatwebrtcnew.activities.CallActivity.TAG, "Stop new session. Device now is busy");
        session.rejectCall(null);
    }
}