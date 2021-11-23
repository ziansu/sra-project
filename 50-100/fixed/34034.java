private void preOrderPrint(TreeNode<T> parent) {
    java.lang.System.out.println(java.lang.String.format("(key = %d, val = %s)", parent.key, parent.value));
    if ((parent.left) != null)
        preOrderPrint(parent.left);
    
    if ((parent.right) != null)
        preOrderPrint(parent.right);
    
}