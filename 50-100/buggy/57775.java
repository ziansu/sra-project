public void addTaskInQueue(com.kiwi.flickrbatchdownload.download.TaskInfo taskInfo) {
    android.util.Log.d("Jane", ("downloadQueue = " + (downloadQueue)));
    if ((downloadQueue) != null) {
        downloadQueue.add(taskInfo);
        android.util.Log.d("Jane", ("addTaskInQueue id = " + (taskInfo.getImageUrl())));
        if (((isRunning) == false) && ((downloadQueue.size()) > 0)) {
            startDownload();
        }
    }
}