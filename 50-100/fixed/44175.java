public Ticket peekMin() {
    int indexOfLargest = 0;
    for (int x = 0; x < (_queue.size()); x++) {
        if ((_queue.get(x).compareTo(_queue.get(indexOfLargest))) == 0) {
            indexOfLargest = x;
        }
    }
    return _queue.get(indexOfLargest);
}