@java.lang.Override
public void close() {
    isRunning.set(false);
    wakeup();
    kafkaConsumerThreadPool.shutdown();
    while (!(kafkaConsumerThreadPool.isTerminated()));
}