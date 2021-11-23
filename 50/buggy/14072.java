public void enqueue(ch.entwine.weblounge.common.repository.ContentRepositoryOperation<?> operation) {
    operations.add(operation);
    synchronized(operations) {
        operations.notifyAll();
    }
}