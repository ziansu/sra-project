@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    C.unregisterReceiver(this);
    if ((com.nebula.kernelupdater.Tools.userDialog) != null)
        com.nebula.kernelupdater.Tools.userDialog.dismiss();
    
    manager1.cancel(Keys.TAG_NOTIF, 3722);
    createOpenRecoveryScript(("install " + (lastDownloadedFile.getAbsolutePath())), true, false);
}