@java.lang.Override
public void onDetectNewDownloadFile(java.lang.String url, java.lang.String fileName, java.lang.String saveDir, long fileSize) {
    try {
        mDownloadRecorder.resetDownloadFile(finalUrl, isDelete);
        createAndStart(finalUrl, oldFileName, oldFileDir);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        org.wlf.filedownloader.listener.OnFileDownloadStatusListener.FileDownloadStatusFailReason failReason = new org.wlf.filedownloader.listener.OnFileDownloadStatusListener.OnFileDownloadStatusFailReason(e);
        notifyDownloadStatusFailed(finalUrl, failReason, ((getDownloadFile(finalUrl)) != null));
    }
}