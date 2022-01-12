@java.lang.Override
public void call() {
    if (autoInstall) {
        if (context == null) {
            throw new java.lang.IllegalStateException(("Context is NULL! You should call " + "#RxDownload.context(Context context)# first!"));
        }
        zlc.season.rxdownload.function.Utils.installApk(context, new java.io.File(getRealFilePaths(saveName, savePath)[0]));
    }
    deleteDownloadRecord(url);
}