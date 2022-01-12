private void postOrder(BSTNode current) {
    if (current == null)
        return ;
    
    postOrder(current.getLeft());
    postOrder(current.getRight());
    java.lang.System.out.print(((current.getKey()) + " "));
}