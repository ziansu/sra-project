public boolean containsDuplicate(int[] nums) {
    java.util.HashSet<java.lang.Integer> set = new java.util.HashSet<>();
    for (int i : nums) {
        if (set.contains(i)) {
            return true;
        }
        set.add(i);
    }
    return false;
}