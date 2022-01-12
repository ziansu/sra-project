@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    alarms.cancelAlarm(position);
    alarms.deleteAlarm(position);
    notifyDataSetChanged();
    return false;
}