@java.lang.Override
public void onReceive(final android.content.Context context, android.content.Intent intent) {
    cse110m260t9.qralarm.MainActivity.getAlarmRingText().setText("Enough Rest. Do Work Now!");
    android.net.Uri uri = android.media.RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
    android.media.Ringtone ringtone = android.media.RingtoneManager.getRingtone(context, uri);
    ringtone.play();
    android.content.Intent scannerIntent = new android.content.Intent(context, cse110m260t9.qralarm.QRScannerActivity.class);
    scannerIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    context.startActivity(scannerIntent);
}