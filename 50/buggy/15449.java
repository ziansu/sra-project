@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.content.Intent service = new android.content.Intent(context, it.android.unishare.BackgroundService.class);
    context.startService(service);
}