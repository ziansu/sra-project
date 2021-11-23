private void adjustSize(int newSize) {
    Item[] tmp = new Item[newSize];
    for (int i = 0; i < newSize; i++) {
        tmp[i] = queue[i];
    }
    rq = tmp;
}