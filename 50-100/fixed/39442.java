@java.lang.Override
public void threadEnd(java.lang.String threadName) {
    synchronized(lock) {
        threadCounter.decrementAndGet();
        THREAD_INSTANCE_CONTAINER.remove(threadName);
        if ((threadCounter.get()) == 0) {
            if (((!(downloadConf.isEnableLocalCheckFirstOnly)) && (downloadConf.isEnableLocalCheckFirst)) && ((downloadCacheTasks.size()) > 0)) {
                startDownloadCacheTask();
            }else {
                com.mayhub.utils.download.FileDownloaderManager.INSTANCE_CONTAINER.get(tag).release();
            }
        }
    }
}