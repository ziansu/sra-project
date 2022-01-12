public java.util.List<java.util.List<java.lang.Integer>> permute0(int[] nums) {
    java.util.List<java.util.List<java.lang.Integer>> result = new java.util.LinkedList<java.util.List<java.lang.Integer>>();
    if ((nums.length) == 0) {
        return result;
    }
    java.util.List<java.lang.Integer> rootList = new java.util.ArrayList<java.lang.Integer>();
    for (int num : nums) {
        rootList.add(num);
    }
    dfs(rootList, 0, result);
    return result;
}