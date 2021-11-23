@java.lang.Override
public V get(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
    return edu.brown.cs.systems.tracing.aspects.UnadvisedProxy.futureGet(wrapped, timeout, unit);
}