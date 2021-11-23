public LLNode<E> getNodeFromIndex(int x) {
    int index = 0;
    LLNode<E> item = first;
    while ((item != null) && (index < x)) {
        index++;
        item = item.getNext();
    } 
    if (item == null)
        return null;
    else
        return item;
    
}