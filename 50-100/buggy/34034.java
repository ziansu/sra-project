private void preOrderPrint(TreeNode<T> parent) {
    java.lang.System.out.println(java.lang.String.format("(key = %d, val = %s)", parent.key, parent.value));
    if ((parent.left) != null)
        inOrderPrint(parent.left);
    
    if ((parent.right) != null)
        inOrderPrint(parent.right);
    
}