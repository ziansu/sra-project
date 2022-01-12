@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    this.C.unregisterReceiver(this);
    if ((com.nebula.kernelupdater.Tools.userDialog) != null)
        com.nebula.kernelupdater.Tools.userDialog.dismiss();
    
    manager1.cancel(Keys.TAG_NOTIF, 3722);
    this.createOpenRecoveryScript(("install " + (this.lastDownloadedFile.getAbsolutePath())), true, false);
}