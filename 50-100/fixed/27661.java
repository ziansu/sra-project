protected void replace(org.observe.util.tree.RedBlackNode node) {
    if (node != (theLeft))
        node.setChild(theLeft, true);
    
    if (node != (theRight))
        node.setChild(theRight, false);
    
    setChild(null, true);
    setChild(null, false);
    node.setRed(isRed);
    if ((theParent) != null) {
        theParent.setChild(node, getSide());
        setParent(null);
    }else
        node.setParent(theParent);
    
}