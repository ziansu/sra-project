private void setUpReceiver() {
    sync = new rs.tickettracker.sync.SyncReceiver();
    android.content.Intent alarmIntent = new android.content.Intent(this, rs.tickettracker.sync.SyncService.class);
    pendingIntent = android.app.PendingIntent.getService(this, 0, alarmIntent, 0);
    manager = ((android.app.AlarmManager) (getSystemService(Context.ALARM_SERVICE)));
}