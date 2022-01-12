public static int removeElement(int[] nums, int target) {
    int index = 0;
    for (int i = 0; i < (nums.length); i++) {
        if ((nums[i]) != target) {
            nums[(index++)] = nums[i];
        }
    }
    return index;
}