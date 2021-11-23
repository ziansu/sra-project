public java.util.List<java.util.List<java.lang.Integer>> findSubsequences(int[] nums) {
    java.util.List<java.lang.Integer> list = new java.util.ArrayList<>();
    for (int num : nums) {
        list.add(num);
    }
    java.util.Set<java.util.List<java.lang.Integer>> result = new java.util.HashSet<>();
    leetcode.Problem491.findSubsequences(list, 0, new java.util.ArrayList<>(), result);
    return new java.util.ArrayList<>(result);
}