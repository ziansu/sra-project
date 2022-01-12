public int unshift(int value) {
    if ((size) == (capacity)) {
        resize();
    }
    for (int i = size; i > 0; i--) {
        data[i] = data[(i - 1)];
    }
    data[0] = value;
    (size)++;
}