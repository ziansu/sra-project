@java.lang.Override
public void close() {
    kafkaConsumerThreadPool.shutdown();
    isRunning.set(false);
    wakeup();
    while (!(kafkaConsumerThreadPool.isTerminated()));
}