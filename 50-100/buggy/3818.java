@java.lang.Override
public void threadError(com.mayhub.utils.download.DownloadTask downloadTask1, java.lang.String threadName) {
    synchronized(lock) {
        downloadingTasks.remove(downloadTask1);
        THREAD_INSTANCE_CONTAINER.remove(threadName);
        if ((downloadTask1.getProcessTimes()) <= (downloadConf.maxRetryCount)) {
            downloadTasks.add(downloadTask1);
        }
    }
}