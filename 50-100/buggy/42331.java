private synchronized void checkAllThreadsFinished() {
    boolean allFinished = true;
    for (com.busysnail.filedownload.services.DownloadTask.DownloadThread thread : mDownloadThreadList) {
        if ((thread.isFinished) == false)
            allFinished = false;
        
        break;
    }
    if (allFinished) {
        mDao.deleteThread(mFileInfo.getUrl());
        android.content.Intent intent = new android.content.Intent(DownloadService.ACTION_FINISHED);
        intent.putExtra(DownloadService.FILEINFO, mFileInfo);
        mContext.sendBroadcast(intent);
    }
}