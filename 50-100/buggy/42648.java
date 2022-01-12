private void cleanupGroup(java.lang.Object key) {
    rx.internal.operators.OperatorGroupBy.GroupBySubscriber.GroupState<K, T> removed;
    removed = groups.remove(key);
    if (removed != null) {
        if ((removed.buffer.size()) > 0) {
            rx.internal.operators.OperatorGroupBy.GroupBySubscriber.BUFFERED_COUNT.addAndGet(self, (-(removed.buffer.size())));
        }
        completeInner();
        requestMoreIfNecessary();
    }
}