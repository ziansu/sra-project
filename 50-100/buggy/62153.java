@java.lang.Override
public boolean awaitTermination(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
    boolean result = true;
    for (com.mahasekhar.common.lang.concurrent.executors.SequenceExecutor sequenceExecutor : sequenceExecutors.values()) {
        result = result && (sequenceExecutor.awaitTermination(timeout, unit));
    }
    return result;
}