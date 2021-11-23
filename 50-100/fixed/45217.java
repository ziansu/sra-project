private static int kadansModToWorkWithNegs(int[] nums) {
    int maxSoFar = nums[0];
    int maxEndingHere = nums[0];
    for (int i = 1; i < (nums.length); i++) {
        maxEndingHere = java.lang.Math.max((maxEndingHere + (nums[i])), nums[i]);
        maxSoFar = java.lang.Math.max(maxSoFar, maxEndingHere);
        if (maxEndingHere < 0) {
            maxEndingHere = 0;
        }
    }
    return maxSoFar;
}