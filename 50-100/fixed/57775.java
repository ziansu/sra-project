public void addTaskInQueue(com.kiwi.flickrbatchdownload.download.TaskInfo taskInfo) {
    if (((downloadQueue) != null) && (!(downloadQueue.contains(taskInfo)))) {
        downloadQueue.add(taskInfo);
        if (((isRunning) == false) && ((downloadQueue.size()) > 0)) {
            startDownload();
        }
    }
}