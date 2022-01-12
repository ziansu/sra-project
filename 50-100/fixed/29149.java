public Item removeFirst() {
    if ((size()) == 0) {
        throw new java.util.NoSuchElementException();
    }
    Item value = first.item;
    if ((size()) == 1) {
        first = null;
        last = first;
        (size)--;
        return value;
    }
    first = first.forward;
    first.backward = null;
    (size)--;
    if ((size()) == 0) {
        last = null;
    }
    return value;
}