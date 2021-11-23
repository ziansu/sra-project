public void start() {
    java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newSingleThreadExecutor();
    future = executor.submit(mAcceptTask);
}