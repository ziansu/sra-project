private void removeAlarm(int id) {
    android.util.Log.i("dora", ("id removed" + id));
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.ferit.dfundak.georeminder.AlarmReceiver.class);
    android.app.PendingIntent pendingIntent = android.app.PendingIntent.getBroadcast(getApplicationContext(), id, intent, 0);
    android.app.AlarmManager alarmManager = ((android.app.AlarmManager) (this.getSystemService(com.ferit.dfundak.georeminder.ALARM_SERVICE)));
    alarmManager.cancel(pendingIntent);
    removeGeofences();
    android.widget.Toast.makeText(this, "Reminder removed", Toast.LENGTH_SHORT).show();
}