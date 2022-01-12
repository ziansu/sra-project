public void shutDownExecutor(long timeOut, java.util.concurrent.TimeUnit timeUnit) {
    if ((null != (executor)) && (!(executor.isShutdown()))) {
        executor.shutdown();
        try {
            executor.awaitTermination(timeOut, timeUnit);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        } finally {
            executor = null;
        }
    }
}