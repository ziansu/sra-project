public void enqueue(Item item) {
    if (item == null) {
        throw new java.lang.NullPointerException();
    }
    if ((size()) >= ((queueArray.length) / 2)) {
        doubleCapacity();
    }
    if ((size()) == 0) {
        queueArray[index] = item;
        (size)++;
    }else {
        (index)++;
        queueArray[index] = item;
        (size)++;
    }
}