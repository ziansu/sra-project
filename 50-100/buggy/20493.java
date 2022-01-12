private void resize(int newSize) {
    Item[] tmp = ((Item[]) (new java.lang.Object[newSize]));
    int h = head;
    int count = size();
    for (int i = 0; i < count; i++) {
        tmp[i] = items[h];
        h = (h + 1) % (items.length);
    }
    items = tmp;
    head = 0;
    tail = count - 1;
}