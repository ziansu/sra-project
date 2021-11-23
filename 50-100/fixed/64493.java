@java.lang.Override
public void onReceiveNewSession(com.quickblox.videochat.webrtc.QBRTCSession session) {
    android.util.Log.d(com.quickblox.q_municate_core.qb.helpers.QBVideoChatHelper.CALL_INTEGRATION, "QBVideoChatHelper. RTCClient. onReceiveNewSession");
    if ((getVideoChatHelperState()) != (com.quickblox.q_municate_core.qb.helpers.QBVideoChatHelper.VideoHelperStates.RTC_CLIENT_PROCESS_CALLS)) {
        setVideoChatHelperState(com.quickblox.q_municate_core.qb.helpers.QBVideoChatHelper.VideoHelperStates.RTC_CLIENT_PROCESS_CALLS);
        android.util.Log.d(com.quickblox.q_municate_core.qb.helpers.QBVideoChatHelper.CALL_INTEGRATION, "On client receive new session");
        setCurrentSession(session);
        for (com.quickblox.q_municate_core.qb.helpers.call.VideoChatHelperListener listener : videoChatListenersList) {
            listener.onClientReady();
        }
    }else {
        sessionManager.addSession(session);
        session.rejectCall(getCurrentSession().getUserInfo());
    }
}