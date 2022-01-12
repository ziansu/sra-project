@java.lang.Override
public void onClick(android.view.View v) {
    if (mAction.isRoot()) {
        android.util.Log.e("DSLV", "Tried to remove root");
        return ;
    }
    com.apps.quantum1.Action toDelete = mAction;
    mAction = toDelete.getParent();
    removeAction(toDelete);
    updateListToShowCurrentAction();
    updateFooter();
    java.lang.String toastText = "Task completed";
    android.widget.Toast.makeText(getActivity(), toastText, Toast.LENGTH_SHORT).show();
}