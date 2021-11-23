@java.lang.Override
public boolean contains(java.lang.Comparable x) {
    if ((x.compareTo(smallest.elt)) == 0)
        return true;
    
    lab3.SortedLinkedListSet.Node currentNode = smallest.getNext();
    while (currentNode != null) {
        if ((x.compareTo(currentNode.elt)) == 0)
            return true;
        
        currentNode = currentNode.getNext();
    } 
    return false;
}