private void addTxItemOrdered(com.hazelcast.collection.impl.txnqueue.TxQueueItem txQueueItem) {
    java.util.ListIterator<com.hazelcast.collection.impl.queue.QueueItem> iterator = ((java.util.List) (getItemQueue())).listIterator();
    while (iterator.hasNext()) {
        com.hazelcast.collection.impl.queue.QueueItem queueItem = iterator.next();
        if ((txQueueItem.itemId) < (queueItem.itemId)) {
            iterator.previous();
            break;
        }
    } 
    iterator.add(txQueueItem);
}