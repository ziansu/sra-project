@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    com.midburn.gate.midburngate.model.Group selectedGroup = groupsArrayList.get(which);
    android.util.Log.d(AppConsts.TAG, (((selectedGroup.getName()) + " was clicked. id: ") + (selectedGroup.getId())));
    mProgressBar.setVisibility(View.VISIBLE);
    sendEntranceRequest(selectedGroup.getId());
}