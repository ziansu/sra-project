private void resize(int capacity) {
    Item[] copy = ((Item[]) (new java.lang.Object[capacity]));
    int j = 0;
    for (int i = 0; i < (tail); i++) {
        if ((items[i]) != null) {
            copy[(j++)] = items[i];
        }
    }
    items = copy;
    tail = N;
}