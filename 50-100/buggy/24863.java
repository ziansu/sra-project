@java.lang.Override
public synchronized void stop() throws java.lang.Exception {
    if (running) {
        cursorProvider.stop();
        running = false;
        flushExecutors();
        if ((currentPage) != null) {
            currentPage.close();
            currentPage = null;
        }
    }
}