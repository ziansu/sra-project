@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
        context.startService(new android.content.Intent(context, com.ganet.catfish.ganet_service.GaNetService.class));
    }
    throw new java.lang.UnsupportedOperationException("Not yet implemented");
}