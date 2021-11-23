public Item removeFirst() {
    if ((size()) == 0) {
        throw new java.util.NoSuchElementException();
    }
    Item value = first.item;
    first = first.forward;
    if ((first) != null) {
        first.backward = null;
    }
    (size)--;
    if ((size()) == 0) {
        last = null;
    }
    return value;
}