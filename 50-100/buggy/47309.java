public boolean containsDuplicate(int[] nums) {
    com.javapractice.leetcode.HashSet<java.lang.Integer> set = new com.javapractice.leetcode.HashSet();
    for (int i : nums) {
        if (set.contains(i)) {
            return true;
        }
        set.add(i);
    }
    return false;
}