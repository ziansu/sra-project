public static void insertionSort(int[] array) {
    for (int top = 1; top < (array.length); ++top) {
        int temp = array[top];
        int pos = top - 1;
        while ((pos >= 0) && ((array[pos]) > temp)) {
            array[(pos + 1)] = array[pos];
            pos--;
        } 
        array[(pos + 1)] = temp;
    }
}