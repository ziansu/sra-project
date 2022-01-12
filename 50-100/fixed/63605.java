@java.lang.Override
public void onResume() {
    super.onResume();
    com.quickblox.videochat.webrtcnew.QBRTCSession session = ((com.quickblox.sample.videochatwebrtcnew.activities.NewDialogActivity) (getActivity())).getCurrentSession();
    if ((startReason) == (NewDialogActivity.StartConversetionReason.INCOME_CALL_FOR_ACCEPTION.ordinal())) {
        session.acceptCall(session.getUserInfo());
    }else {
        session.startCall(session.getUserInfo());
    }
}