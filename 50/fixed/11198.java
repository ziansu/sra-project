@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    com.firebirdberlin.nightdream.services.AlarmService.startAlarm(context);
    com.firebirdberlin.nightdream.NightDreamActivity.start(context);
}