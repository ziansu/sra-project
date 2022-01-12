public Item removeLast() {
    Item item = array[((last) - 1)];
    if (item == null) {
        throw new java.util.NoSuchElementException();
    }
    array[((last) - 1)] = null;
    (N)--;
    last = N;
    subSize();
    return item;
}