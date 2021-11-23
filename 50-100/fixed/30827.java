private void adjustSize(int newSize) {
    Item[] tmp = ((Item[]) (new java.lang.Object[newSize]));
    for (int i = 0; i < newSize; i++) {
        tmp[i] = queue[i];
    }
    queue = tmp;
}