public void add(int key) {
    (heapSize)++;
    if ((heapSize) > (array.length)) {
        resizeArray();
    }
    array[((heapSize) - 1)] = java.lang.Integer.MIN_VALUE;
    try {
        increaseKey(((heapSize) - 1), key);
    } catch (SmallKeyException ignored) {
    }
}