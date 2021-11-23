private void resize(int newSize) {
    Item[] tmp = ((Item[]) (new java.lang.Object[newSize]));
    int h = head;
    for (int i = 0; i < (size); i++) {
        tmp[i] = items[h];
        h = (h + 1) % (items.length);
    }
    items = tmp;
    head = 0;
    tail = (size) - 1;
}