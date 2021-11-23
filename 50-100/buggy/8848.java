public Item removeLast() {
    Item item = array[last];
    if (item == null) {
        throw new java.util.NoSuchElementException();
    }
    array[last] = null;
    (last)--;
    (N)--;
    subSize();
    return item;
}