private void shiftQueue() {
    for (int i = 0; i < (size()); ++i) {
        queue.set(i, queue.get(((endIndex) + i)));
    }
    queue.shrinkBy(endIndex);
    endIndex = 0;
}