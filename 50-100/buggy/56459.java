private static void mergeSort(int[] array, int left, int right) {
    if (left < right) {
        int center = (left + right) / 2;
        Main.mergeSort(array, left, center);
        Main.mergeSort(array, (center + 1), right);
        Main.merge(array, left, (center + 1), right);
    }
}