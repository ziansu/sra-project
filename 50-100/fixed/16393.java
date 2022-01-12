public FileLine removeMin() throws PriorityQueueEmptyException {
    if (this.isEmpty()) {
        throw new PriorityQueueEmptyException();
    }
    if ((numItems) == 1) {
        FileLine tmp = queue[1];
        queue[1] = null;
        (numItems)--;
        return tmp;
    }
    FileLine tmp = queue[1];
    queue[1] = queue[numItems];
    queue[numItems] = null;
    (numItems)--;
    reheapifyDown(1);
    return tmp;
}