public void startAllTask() {
    for (int i = 0; i < (mTaskList.size()); i++) {
        com.openthos.appstore.download.Downloader deletedownloader = mTaskList.get(i);
        com.openthos.appstore.bean.DownloadInfo downloadInfo = deletedownloader.getDownloadInfo();
        if (((downloadInfo != null) && ((downloadInfo.getFileSize()) != 0)) && ((downloadInfo.getFileSize()) != (downloadInfo.getDownloadSize()))) {
            deletedownloader.start();
        }
    }
}