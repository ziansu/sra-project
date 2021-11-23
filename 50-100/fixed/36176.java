public static double calculateTime(int len) {
    int[] arr = new int[len];
    MergeSortTester.populateArr(arr, len);
    long startTime = java.lang.System.nanoTime();
    MergeSort.sort(arr);
    long endTime = java.lang.System.nanoTime();
    long duration = endTime - startTime;
    return duration / 1000000.0F;
}