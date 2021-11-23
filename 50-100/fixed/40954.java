private void resize(int n) {
    Item[] arr = ((Item[]) (new java.lang.Object[n]));
    for (int i = 0; i < (size); i++) {
        arr[i] = array[i];
    }
    array = arr;
}