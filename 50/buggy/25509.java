@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
        context.startService(new android.content.Intent(context, ru.spbau.mit.foodmanager.NotificationService.class));
    }
}