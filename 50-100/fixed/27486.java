public <T> T[] invert(T[] array) {
    T temp;
    int size = array.length;
    for (int i = 0; i < (size / 2); i++) {
        int index = (size - i) - 1;
        temp = array[i];
        array[i] = array[index];
        array[index] = temp;
    }
    return array;
}