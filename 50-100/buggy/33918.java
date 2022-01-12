@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    final android.content.Intent dialogIntent;
    if (com.estvis.oaslibrary.Settings.Config.getInstance().getUsePinToUnlock(context)) {
        dialogIntent = new android.content.Intent(context, com.estvis.ma.LoginByPinActivity.class);
    }else {
        dialogIntent = new android.content.Intent(context, com.estvis.ma.MainActivity.class);
    }
    dialogIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    startActivity(dialogIntent);
}