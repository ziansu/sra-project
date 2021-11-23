public Item removeLast() {
    if ((size()) == 0) {
        throw new java.util.NoSuchElementException();
    }
    Item value = last.item;
    if ((size()) == 1) {
        last = null;
        first = last;
        (size)--;
        return value;
    }
    last = last.backward;
    last.forward = null;
    (size)--;
    if ((size()) == 0) {
        first = null;
    }
    return value;
}