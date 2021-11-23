public boolean checkBST(CheckIfBST.TreeNode root, int maxValue, int minValue) {
    if (root == null)
        return true;
    
    if (((root.key) > maxValue) || ((root.key) < minValue))
        return false;
    
    if ((!(checkBST(root.left, root.key, minValue))) || (!(checkBST(root.right, maxValue, root.key))))
        return false;
    else
        return true;
    
}