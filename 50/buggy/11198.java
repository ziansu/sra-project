@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    com.firebirdberlin.nightdream.services.AlarmService.startAlarm(context);
    android.os.Bundle alarm = new android.os.Bundle();
    alarm.putString("action", "start alarm");
    com.firebirdberlin.nightdream.NightDreamActivity.start(context, alarm);
}