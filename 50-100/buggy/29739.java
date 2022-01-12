private int getHeightHelper(IntervalNode<T> n) {
    if (n == null)
        return 0;
    
    if (((n.getLeftNode()) == null) && ((n.getRightNode()) == null))
        return 1;
    else
        return java.lang.Math.max(getHeightHelper(n.getLeftNode()), ((getHeightHelper(n.getRightNode())) + 1));
    
}