@java.lang.Override
public void onReceiveHangUpFromUser(com.quickblox.videochat.webrtcnew.QBRTCSession session, java.lang.Integer userID) {
    if ((session.getState().ordinal()) < (QBRTCSession.QBRTCSessionState.QB_RTC_SESSION_REJECTED.ordinal())) {
        addOpponentsFragment();
    }else {
        android.util.Log.d(com.quickblox.sample.videochatwebrtcnew.activities.CallActivity.TAG, ("Can't hangup session with status -->" + (session.getState().name())));
    }
}