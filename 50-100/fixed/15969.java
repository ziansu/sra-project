public int removeDuplicates(int[] nums) {
    int result = 1;
    if (nums == null)
        return 0;
    else
        if ((nums.length) == 1)
            return 1;
        else {
            for (int i = 1; i < (nums.length); i++) {
                if ((nums[i]) != (nums[(i - 1)])) {
                    result++;
                }
            }
            return result;
        }
    
}