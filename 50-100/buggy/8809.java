long nextUniqueTransaction(long time) {
    long id = time * (TcpReplicator.TIMESTAMP_FACTOR);
    for (; ;) {
        long old = transactionID.get();
        if (old >= id)
            id = old + 1;
        
        if (transactionID.compareAndSet(old, id))
            break;
        
    }
    return id;
}