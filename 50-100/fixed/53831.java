@java.lang.Override
public void run() {
    while (!(isInterrupted())) {
        uni.data.FetcherThread.logger.info("Starting fetch...");
        fetcher.fetch();
        uni.data.FetcherThread.logger.info("Finished fetch.");
        try {
            java.lang.Thread.sleep(interval);
        } catch (java.lang.InterruptedException e) {
            return ;
        }
    } 
}