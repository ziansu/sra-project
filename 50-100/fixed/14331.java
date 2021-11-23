public void addFirst(Item item) {
    if (item == null) {
        throw new java.lang.NullPointerException();
    }
    if ((head) == 0) {
        queue = doubleArray(queue, head, tail);
    }
    queue[(--(head))] = item;
}