@java.lang.Override
public void run() throws java.lang.Exception {
    java.lang.Thread.sleep(1500);
    if (mAutoInstall) {
        if ((mContext) == null) {
            throw new java.lang.IllegalStateException(("Context is NULL! You should call " + "#RxDownload.context(Context context)# first!"));
        }
        zlc.season.rxdownload.function.Utils.installApk(mContext, getRealFiles(saveName, savePath)[0]);
    }
    mDownloadHelper.deleteDownloadRecord(url);
}