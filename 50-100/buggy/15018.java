@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String x = retrieveMyPHP.deleteUserEvent(MyApplication.userName, event.getEventid());
    android.widget.Toast.makeText(mActivity.getApplicationContext(), x, Toast.LENGTH_SHORT).show();
    if (x.equals("Event Deleted!")) {
        dbHelper.deleteUserEvent(dbHelper.getWritableDatabase(), event.getEventid());
        mEvents.remove(position);
        notifyDataSetChanged();
    }
}