public static void stop(android.content.Context context) {
    context.stopService(new android.content.Intent(context, tranquvis.simplesmsremote.Services.SmsReceiver.SMSReceiverService.class));
}