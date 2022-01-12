@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (standrews.Agonyaunt.Util.alarmBooted(context)) {
        android.util.Log.i("Track", "start Alarm");
        android.content.Intent ami = new android.content.Intent(context, standrews.Agonyaunt.MyAlarmManager.class);
        context.startService(ami);
    }else {
        android.util.Log.d("Track", "Alarm Recieved!");
        android.content.Intent i = new android.content.Intent(context, standrews.Agonyaunt.NotificationService.class);
        context.startService(i);
    }
}