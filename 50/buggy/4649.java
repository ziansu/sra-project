public void addBefore(int index, Item element) {
    checkPositionIndex(index);
    if (index == 1)
        addFirst(element);
    else
        linkBefore(element, node(index));
    
}