public static int partition(int[] array, int start, int end) {
    if ((end - start) >= 1) {
        (AsQuickAsAFlash.Main.pivotCount)++;
    }
    int pivot = array[start];
    while (start < end) {
        while ((array[start]) < pivot) {
            start++;
        } 
        while ((array[end]) > pivot) {
            end--;
        } 
        AsQuickAsAFlash.Main.swap(array, start, end);
    } 
    return start;
}