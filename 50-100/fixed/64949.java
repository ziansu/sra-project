public void insert(FileLine fl) throws PriorityQueueFullException {
    if ((null == fl) || (((numItems) + 1) >= (queue.length))) {
        throw new PriorityQueueFullException();
    }
    queue[(++(numItems))] = fl;
    reheapify(numItems);
}