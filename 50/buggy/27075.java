@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.content.ComponentName comp = new android.content.ComponentName(context.getPackageName(), com.quickblox.sample.chat.pushnotifications.GCMIntentService.class.getName());
    startWakefulService(context, intent.setComponent(comp));
    setResultCode(Activity.RESULT_OK);
}