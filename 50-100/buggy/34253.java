@java.lang.Override
public void call() {
    try {
        java.lang.Thread.sleep(1500);
        if (autoInstall) {
            if (context == null) {
                throw new java.lang.IllegalStateException(("Context is NULL! You should call " + "#RxDownload.context(Context context)# first!"));
            }
            zlc.season.rxdownload.function.Utils.installApk(context, new java.io.File(getRealFilePaths(saveName, savePath)[0]));
        }
    } catch (java.lang.InterruptedException e) {
        throw new java.lang.IllegalStateException(e);
    }
    deleteDownloadRecord(url);
}