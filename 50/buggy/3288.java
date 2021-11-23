private static void release() {
    com.mozz.http.HttpUtils.mInstanceCount.decrementAndGet();
    if ((com.mozz.http.HttpUtils.mInstanceCount.get()) == 0) {
        com.mozz.http.HttpUtils.httpExecutor.shutdown();
        com.mozz.http.HttpUtils.httpExecutor = null;
    }
}