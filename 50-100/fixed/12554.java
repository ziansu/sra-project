private void resize(int capacity) {
    assert capacity >= (N);
    Item[] temp = ((Item[]) (new java.lang.Object[capacity]));
    for (int i = 0; i < (N); i++) {
        copyIfNotNull(a, temp, i, i);
    }
    a = temp;
}