public void inOrder(TreeNode current) {
    if (current == null) {
        inOrder(root);
    }else {
        if ((current.getLeft()) != null) {
            inOrder(current.getLeft());
        }
        java.lang.System.out.println(current.getData());
        if ((current.getRight()) != null) {
            inOrder(current.getRight());
        }
    }
}