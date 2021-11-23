public int insert(E element) {
    int index = binarySearch(element);
    if ((size()) >= (elements.size()))
        elements.ensureCapacity((((size()) * 2) + 16));
    
    if (index < 0)
        index = (-index) - 1;
    
    elements.add(index, element);
    return index;
}