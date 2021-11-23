@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    alarms.deleteAlarm(position);
    alarms.cancelAlarm(position);
    notifyDataSetChanged();
    return false;
}