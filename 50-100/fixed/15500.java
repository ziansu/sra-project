private static int maximumSubarraySum(int[] arr) {
    int globalMax = arr[0];
    int maxCurrent = arr[0];
    int num;
    for (int i = 1; i < (arr.length); i++) {
        num = arr[i];
        maxCurrent = java.lang.Math.max((maxCurrent + num), num);
        globalMax = java.lang.Math.max(globalMax, maxCurrent);
    }
    return globalMax;
}