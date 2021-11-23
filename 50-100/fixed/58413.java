private void resize(int capacity) {
    Item[] copy = ((Item[]) (new java.lang.Object[capacity]));
    for (int i = 0; i <= (size); i++) {
        copy[i] = arr[(((first) + i) % (arr.length))];
    }
    arr = copy;
}