private static int maximumSubarraySum(int[] arr) {
    int globalMax = arr[0];
    int maxCurrent = arr[0];
    for (int num : arr) {
        maxCurrent = java.lang.Math.max((maxCurrent + num), num);
        globalMax = java.lang.Math.max(globalMax, maxCurrent);
    }
    return globalMax;
}