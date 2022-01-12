private void shiftQueue() {
    for (int i = 0; i < (queue.size()); ++i) {
        queue.set(i, queue.get(((endIndex) + i)));
    }
    queue.shrinkBy(endIndex);
    endIndex = 0;
}