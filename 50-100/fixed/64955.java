@java.lang.Override
public void onCallRejectByUser(com.quickblox.videochat.webrtc.QBRTCSession session, java.lang.Integer userID, java.util.Map<java.lang.String, java.lang.String> userInfo) {
    setStateTitle(userID, R.string.rejected, View.INVISIBLE);
    com.quickblox.sample.videochatwebrtcnew.fragments.ConversationFragment fragment = ((com.quickblox.sample.videochatwebrtcnew.fragments.ConversationFragment) (getFragmentManager().findFragmentByTag(com.quickblox.sample.videochatwebrtcnew.activities.CallActivity.CONVERSATION_CALL_FRAGMENT)));
    if (fragment != null) {
        fragment.stopOutBeep();
    }
}