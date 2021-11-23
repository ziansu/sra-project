@java.lang.Override
public void close() {
    kafkaConsumerThreadPool.shutdown();
    wakeup();
    while (!(kafkaConsumerThreadPool.isTerminated()));
    isRunning.set(false);
}