private void preOrder(BSTNode current) {
    if (current == null)
        return ;
    
    java.lang.System.out.print(((current.getKey()) + " "));
    preOrder(current.getLeft());
    preOrder(current.getRight());
}