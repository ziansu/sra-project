static void bubbleSortOneIteration(int[] array) {
    if ((array.length) <= 1) {
        return ;
    }
    int temp;
    for (int i = 1; i < (array.length); i++) {
        temp = array[i];
        array[i] = array[(i - 1)];
        array[(i - 1)] = temp;
    }
}