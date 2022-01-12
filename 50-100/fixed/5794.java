@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d("Track", "Call is stopped");
    ((com.quickblox.sample.videochatwebrtcnew.activities.NewDialogActivity) (getActivity())).getCurrentSession().hangUp(userInfo);
    ((com.quickblox.sample.videochatwebrtcnew.activities.NewDialogActivity) (getActivity())).removeConversationFragment();
}