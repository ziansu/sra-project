@java.lang.Override
public org.kiteq.remoting.response.KiteResponse get(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
    this.lock.lock();
    try {
        if (null == (response)) {
            condition.await(timeout, unit);
        }
    } finally {
        org.kiteq.remoting.response.ResponseFuture.futureMap.remove(requestId);
        this.lock.unlock();
    }
    return response;
}