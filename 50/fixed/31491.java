public com.codeabovelab.dm.common.utils.SingleValueCache.Builder<T> timeAfterWrite(java.util.concurrent.TimeUnit unit, long ttl) {
    com.codeabovelab.dm.common.utils.SingleValueCache.Builder.setTimeAfterWrite(unit.toMillis(ttl));
    return this;
}