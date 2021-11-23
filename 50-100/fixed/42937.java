public static void quickSort(int[] array, int start, int end) {
    if (end <= start) {
        return ;
    }
    int pivotIndex = AsQuickAsAFlash.Main.partition(array, start, end);
    AsQuickAsAFlash.Main.quickSort(array, start, (pivotIndex - 1));
    AsQuickAsAFlash.Main.quickSort(array, (pivotIndex + 1), end);
}