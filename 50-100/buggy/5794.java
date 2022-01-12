@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d("Track", "Call is stopped");
    if ((sessionID) == null) {
        ((com.quickblox.sample.videochatwebrtcnew.activities.NewDialogActivity) (getActivity())).getCurrentSession().hangUp(userInfo);
    }else {
        ((com.quickblox.sample.videochatwebrtcnew.activities.NewDialogActivity) (getActivity())).getSession(sessionID).hangUp(userInfo);
    }
    ((com.quickblox.sample.videochatwebrtcnew.activities.NewDialogActivity) (getActivity())).removeConversationFragment();
}