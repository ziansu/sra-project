public boolean hasNext() {
    if ((current) == null) {
        return (root) != null;
    }
    if ((current.getRight()) != null)
        return true;
    
    assignmentDS.util.MyBinTree.Node currentParent = parent(current);
    if (currentParent == null)
        return false;
    
    while (!(isLeftChild(current, currentParent))) {
        assignmentDS.util.MyBinTree.Node localcurrent = currentParent;
        currentParent = parent(localcurrent);
        if (currentParent == null)
            return false;
        
    } 
    return true;
}