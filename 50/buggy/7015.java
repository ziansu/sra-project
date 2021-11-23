@java.lang.Override
public java.lang.Boolean call() throws java.lang.Exception {
    cyclicBarrier.await();
    long id = (com.weibo.api.motan.util.RequestIdGenerator.getRequestId()) >> (RequestIdGenerator.BITS);
    boolean result = (memory.putIfAbsent(id, "")) == null;
    return result;
}