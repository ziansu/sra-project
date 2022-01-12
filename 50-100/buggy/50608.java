@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.util.Log.d("OnBootCompletedBroadcastReceiver", "onReceive before if");
    if (com.voidgreen.eyesrelax.utilities.SharedPrefUtility.isStartOnBootEnabled(context)) {
        android.util.Log.d("OnBootCompletedBroadcastReceiver", "onReceive in if");
        android.content.res.Resources resources = context.getResources();
        android.content.Intent serviceIntent = new android.content.Intent(context, com.voidgreen.eyesrelax.service.TimeService.class);
        intent.putExtra(resources.getString(R.string.serviceTask), resources.getString(R.string.startTask));
        intent.addCategory(TimeService.TAG);
        context.startService(serviceIntent);
    }
}