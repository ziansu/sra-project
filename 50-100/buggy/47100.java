private void postOrderPrint(TreeNode<T> parent) {
    if ((parent.left) != null)
        inOrderPrint(parent.left);
    
    if ((parent.right) != null)
        inOrderPrint(parent.right);
    
    java.lang.System.out.println(java.lang.String.format("(key = %d, val = %s)", parent.key, parent.value));
}