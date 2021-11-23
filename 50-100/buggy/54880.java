public static int maxDiff(int[] nums) {
    if ((nums.length) <= 1) {
        return -1;
    }
    int min = java.lang.Integer.MAX_VALUE;
    int diff = 0;
    for (int n : nums) {
        diff = java.lang.Math.max((n - min), diff);
        min = java.lang.Math.min(n, min);
    }
    return diff != 0 ? diff : -1;
}