public static void insertionSort(int[] data) {
    for (int index = 1; index < (data.length); index++) {
        int temp = data[index];
        for (int other = index; (other >= 0) && (temp < (data[(other - 1)])); other--) {
            data[other] = data[(other - 1)];
        }
        data[other] = temp;
    }
}