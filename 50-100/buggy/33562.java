@java.lang.Override
public void onSessionStartClose(com.quickblox.videochat.webrtc.QBRTCSession session) {
    com.quickblox.sample.videochatwebrtcnew.fragments.ConversationFragment fragment = ((com.quickblox.sample.videochatwebrtcnew.fragments.ConversationFragment) (getFragmentManager().findFragmentByTag(com.quickblox.sample.videochatwebrtcnew.activities.CallActivity.CONVERSATION_CALL_FRAGMENT)));
    if ((fragment != null) && (session.equals(getCurrentSession()))) {
        fragment.actionButtonsEnabled(false);
    }
    android.util.Log.d(com.quickblox.sample.videochatwebrtcnew.activities.CallActivity.TAG, "Start stopping session");
}