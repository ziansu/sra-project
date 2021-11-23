private static void startServiceUiWarning(android.content.Context context) {
    context.stopService(new android.content.Intent(context, duongmh3.bittrexmanager.service.WarningChatHeadService.class));
    context.startService(new android.content.Intent(context, duongmh3.bittrexmanager.service.WarningChatHeadService.class));
}