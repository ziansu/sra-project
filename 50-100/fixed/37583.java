private void resize(int length) {
    Item[] temp = ((Item[]) (new java.lang.Object[length]));
    for (int i = 0; i < (N); i++) {
        temp[i] = array[(((first) + i) % (array.length))];
    }
    array = temp;
    first = 0;
    last = N;
}