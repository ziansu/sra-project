@java.lang.Override
public void onResume() {
    super.onResume();
    if ((startReason) == (NewDialogActivity.StartConversetionReason.INCOME_CALL_FOR_ACCEPTION.ordinal())) {
        com.quickblox.videochat.webrtcnew.QBRTCSession session = ((com.quickblox.sample.videochatwebrtcnew.activities.NewDialogActivity) (getActivity())).getSession(sessionID);
        if (session != null) {
            session.acceptCall(session.getUserInfo());
        }
    }else {
        ((com.quickblox.sample.videochatwebrtcnew.activities.NewDialogActivity) (getActivity())).getCurrentSession().startCall(new java.util.HashMap<java.lang.String, java.lang.String>());
    }
}