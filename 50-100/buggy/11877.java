public E get(int index) {
    LinkedSet<E>.Item<E> item = main;
    if ((index < 0) || (index >= (size))) {
        throw new java.lang.IndexOutOfBoundsException((((("Index " + index) + " isn't in range (0 - ") + (size)) + ")"));
    }
    for (int i = 0; i < index; i++) {
        item = item.next;
    }
    return item.item;
}