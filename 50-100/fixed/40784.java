public int[] swap(int value1, int value2, int index, int[] array) {
    if (value1 < value2) {
        array[index] = value2;
        array[(index - 1)] = value1;
    }
    return array;
}