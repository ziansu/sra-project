public int countNodes(hou.forwz.Leetcode.structure.TreeNode root) {
    int leftDeep = deep(root.left);
    int rightDeep = deep(root.right);
    if (leftDeep == rightDeep) {
        return ((int) ((java.lang.Math.pow(2, leftDeep)) + (countNodes(root.right))));
    }else
        return ((int) (java.lang.Math.pow(2, rightDeep))) + (countNodes(root.left));
    
}