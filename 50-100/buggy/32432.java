public Item removeLast() {
    if ((size()) == 0) {
        throw new java.util.NoSuchElementException();
    }
    Item item = last.item;
    last = last.backward;
    if ((last) != null) {
        last.forward = null;
    }
    (size)--;
    if ((size()) == 0) {
        first = null;
    }
    return item;
}