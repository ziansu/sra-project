public int unshift(int value) {
    if ((size) == (capacity)) {
        resize();
    }
    for (int i = size; i > 0; i--) {
        arr[i] = arr[(i - 1)];
    }
    arr[0] = value;
    (size)++;
}