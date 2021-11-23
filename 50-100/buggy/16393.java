public FileLine removeMin() throws PriorityQueueEmptyException {
    if (this.isEmpty())
        throw new PriorityQueueEmptyException();
    
    if ((numItems) == 1) {
        FileLine temp = queue[1];
        queue[1] = null;
        (numItems)--;
        return temp;
    }
    FileLine tmp = queue[1];
    queue[1] = queue[numItems];
    (numItems)--;
    reheapifyDown(1);
    return tmp;
}