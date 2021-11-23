private void preOrder(BSTNode current) {
    if (current == null)
        return ;
    
    java.lang.System.out.print(((current.getKey()) + " "));
    inOrder(current.getLeft());
    inOrder(current.getRight());
}