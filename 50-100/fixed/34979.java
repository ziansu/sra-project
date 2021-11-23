@java.lang.Override
public boolean contains(java.lang.Comparable x) {
    if ((smallest) == null)
        return false;
    
    if ((x.compareTo(smallest.elt)) == 0)
        return true;
    
    if ((smallest.getNext()) == null)
        return false;
    
    lab3.SortedLinkedListSet.Node currentNode = smallest.getNext();
    while (currentNode != null) {
        if ((x.compareTo(currentNode.elt)) == 0)
            return true;
        
        currentNode = currentNode.getNext();
    } 
    return false;
}