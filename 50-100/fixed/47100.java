private void postOrderPrint(TreeNode<T> parent) {
    if ((parent.left) != null)
        postOrderPrint(parent.left);
    
    if ((parent.right) != null)
        postOrderPrint(parent.right);
    
    java.lang.System.out.println(java.lang.String.format("(key = %d, val = %s)", parent.key, parent.value));
}