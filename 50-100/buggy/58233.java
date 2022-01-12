@java.lang.Override
public void onEnabled(android.content.Context context) {
    super.onEnabled(context);
    android.app.AlarmManager alarmManager = ((android.app.AlarmManager) (context.getSystemService(Context.ALARM_SERVICE)));
    alarmManager.setRepeating(AlarmManager.RTC, ((java.lang.System.currentTimeMillis()) + (60 * 1000)), (60 * 1000), createClockTickIntent(context));
}