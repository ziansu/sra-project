@java.lang.SuppressWarnings(value = "unchecked")
private void addTxItemOrdered(com.hazelcast.collection.impl.txnqueue.TxQueueItem txQueueItem) {
    final java.util.ListIterator<com.hazelcast.collection.impl.queue.QueueItem> iterator = ((java.util.List<com.hazelcast.collection.impl.queue.QueueItem>) (getItemQueue())).listIterator();
    while (iterator.hasNext()) {
        final com.hazelcast.collection.impl.queue.QueueItem queueItem = iterator.next();
        if ((txQueueItem.itemId) < (queueItem.itemId)) {
            iterator.previous();
            break;
        }
    } 
    iterator.add(txQueueItem);
}