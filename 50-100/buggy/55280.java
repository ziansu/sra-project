@java.lang.Override
public org.kiteq.remoting.response.KiteResponse get(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
    try {
        lock.lock();
        condition.await(timeout, unit);
        return response;
    } finally {
        org.kiteq.remoting.response.ResponseFuture.futureMap.remove(requestId);
        lock.unlock();
    }
}