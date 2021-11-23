private int getHeightHelper(IntervalNode<T> n) {
    if (n == null)
        return 0;
    else
        return 1 + (java.lang.Math.max(getHeightHelper(n.getLeftNode()), getHeightHelper(n.getRightNode())));
    
}