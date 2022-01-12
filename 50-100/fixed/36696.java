public void enqueue(int element) {
    if ((size) >= (capacity)) {
        resize(java.lang.Integer.max(((int) ((capacity) * (ca.waterloo.dsg.graphflow.util.IntQueue.RESIZE_MULTIPLIER))), ((capacity) + 1)));
    }
    queue[nextItemIndex] = element;
    nextItemIndex = ((nextItemIndex) + 1) % (capacity);
    (size)++;
}