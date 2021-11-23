private static void release() {
    if ((com.mozz.http.HttpUtils.mInstanceCount.decrementAndGet()) == 0) {
        com.mozz.http.HttpUtils.httpExecutor.shutdown();
        com.mozz.http.HttpUtils.httpExecutor = null;
    }
}