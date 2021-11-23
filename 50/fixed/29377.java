public synchronized communicator.Node next() {
    if ((pqueue.size()) <= 0) {
        throw new java.lang.NullPointerException("No more element present in the queue");
    }
    return pqueue.poll();
}