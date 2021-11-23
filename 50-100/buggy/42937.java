public static void quickSort(int[] array, int start, int end) {
    if (start >= end) {
        return ;
    }
    int pivotIndex = AsQuickAsAFlash.Main.partition(array, start, end);
    AsQuickAsAFlash.Main.quickSort(array, start, pivotIndex);
    AsQuickAsAFlash.Main.quickSort(array, (pivotIndex + 1), end);
}