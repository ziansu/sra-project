private void startAlarmManager() {
    android.util.Log.i(com.example.sifat.gobar.LOG_TAG_TAXIPOSITIONSERVICE, "startAlarmManager");
    android.content.Context context = getBaseContext();
    alarmManager = ((android.app.AlarmManager) (context.getSystemService(Context.ALARM_SERVICE)));
    taxiDetailIntent = new android.content.Intent(context, com.example.sifat.Receiver.TaxiDetailReceiver.class);
    taxiDetailIntent.putExtra(com.example.sifat.gobar.TAXIDETAIL_RECIEVER, taxiDetailResultReceiver);
    taxiDetailIntent.putExtra("test", "Oshan");
    pendingIntent = android.app.PendingIntent.getBroadcast(context, 0, taxiDetailIntent, 0);
    alarmManager.setRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP, android.os.SystemClock.elapsedRealtime(), 10000, pendingIntent);
}