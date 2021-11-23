public void changeValue(com.javapractice.leetcode.List<com.javapractice.leetcode.TreeNode> list) {
    for (int i = (list.size()) - 2; i >= 0; i--) {
        list.get(i).val += list.get((i + 1)).val;
    }
}