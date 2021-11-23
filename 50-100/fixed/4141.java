public static <T> org.infinispan.commons.util.concurrent.NotifyingFuture<java.util.List<T>> combine(final java.util.List<org.infinispan.commons.util.concurrent.NotifyingFuture<T>> futures) {
    if ((futures == null) || (futures.isEmpty()))
        return new org.infinispan.commons.util.concurrent.NoOpFuture(((java.util.List<T>) (null)));
    
    return new org.infinispan.commons.util.concurrent.CompositeNotifyingFuture(futures);
}