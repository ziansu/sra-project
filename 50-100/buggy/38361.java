@java.lang.Override
public void onSessionClosed(com.quickblox.videochat.webrtc.QBRTCSession session) {
    android.util.Log.d(com.quickblox.q_municate_core.qb.helpers.QBVideoChatHelper.CALL_INTEGRATION, "onSessionClosed");
    if (session.equals(getCurrentSession())) {
        android.util.Log.d(com.quickblox.q_municate_core.qb.helpers.QBVideoChatHelper.CALL_INTEGRATION, (("Notify listebers in count of " + (videoChatListenersList.size())) + " about onSessionClosed call"));
        for (com.quickblox.q_municate_core.qb.helpers.call.VideoChatHelperListener listener : videoChatListenersList) {
            listener.onSessionClosed();
        }
        if (session.getSessionID().equals(getCurrentSession())) {
            android.util.Log.d(com.quickblox.q_municate_core.qb.helpers.QBVideoChatHelper.CALL_INTEGRATION, "Stop session");
            setVideoChatHelperState(com.quickblox.q_municate_core.qb.helpers.QBVideoChatHelper.VideoHelperStates.WAIT_FOR_CALL);
        }
    }
}