@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (com.estvis.oaslibrary.Settings.Config.getInstance().getUsePinToUnlock(context)) {
        final android.content.Intent dialogIntent = new android.content.Intent(context, com.estvis.ma.LoginByPinActivity.class);
        dialogIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(dialogIntent);
    }
}