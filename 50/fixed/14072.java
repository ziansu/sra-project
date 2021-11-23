public void enqueue(ch.entwine.weblounge.common.repository.ContentRepositoryOperation<?> operation) {
    synchronized(operations) {
        operations.add(operation);
        operations.notifyAll();
    }
}