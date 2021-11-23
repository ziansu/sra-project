public static void cancel(android.content.Context appContext) {
    if ((cw.kop.autobackground.files.FileHandler.downloadThread) != null) {
        cw.kop.autobackground.files.FileHandler.downloadThread.interrupt();
        android.widget.Toast.makeText(appContext, "Stopping download...", Toast.LENGTH_SHORT).show();
        android.content.Intent closeDrawer = new android.content.Intent(android.content.Intent.ACTION_CLOSE_SYSTEM_DIALOGS);
        appContext.sendBroadcast(closeDrawer);
    }
    cw.kop.autobackground.files.FileHandler.isDownloading = false;
}