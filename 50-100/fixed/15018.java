@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String x = retrieveMyPHP.deleteUserEvent(MyApplication.userName, event.getEventid());
    dbHelper.deleteUserEvent(dbHelper.getWritableDatabase(), event.getEventid());
    android.widget.Toast.makeText(mActivity.getApplicationContext(), x, Toast.LENGTH_SHORT).show();
    mEvents.remove(position);
    notifyDataSetChanged();
}