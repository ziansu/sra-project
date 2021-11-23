@java.lang.Override
public boolean onContextItemSelected(android.view.MenuItem item) {
    java.util.UUID uuid = mTaskViewAdapter.getUUID();
    mDataManager.changeTaskStatus(uuid, item.getTitle().toString());
    android.content.Intent intent = new android.content.Intent(ShowTaskFragment.CUSTOM_INTENT_FILTER);
    android.support.v4.content.LocalBroadcastManager.getInstance(getContext()).sendBroadcast(intent);
    return super.onContextItemSelected(item);
}