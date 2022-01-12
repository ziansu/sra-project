@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.content.Intent startSoundIntent = new android.content.Intent(context, com.philips.lighting.alarm.AlarmSoundService.class);
    startSoundIntent.putExtras(intent);
    context.startService(startSoundIntent);
    android.content.Intent startActivityIntent = new android.content.Intent(context, com.philips.lighting.alarm.AlarmActivity.class);
    startActivityIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    context.startActivity(startActivityIntent);
}