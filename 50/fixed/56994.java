private void execute(int newBufferSize, java.util.concurrent.ExecutorService executor, java.util.concurrent.CountDownLatch latch) {
    execute(newBufferSize, executor, null, latch);
}