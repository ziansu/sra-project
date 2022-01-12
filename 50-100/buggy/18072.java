private static int[] quicksort(int[] array, int left, int right) {
    if (left < right) {
        int pivot = a01.Quicksort.divide(array, left, right);
        if (pivot > 0)
            a01.Quicksort.quicksort(array, left, (pivot - 1));
        
        if ((pivot + 1) < right)
            a01.Quicksort.quicksort(array, (pivot + 1), right);
        
    }
    return array;
}