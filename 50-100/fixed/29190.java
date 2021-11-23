public int insert(E x) {
    int index = binarySearch(x);
    if ((size()) >= (elements.size()))
        elements.ensureCapacity((((size()) * 2) + 16));
    
    if (index < 0)
        index = (-index) - 1;
    
    elements.add(index, x);
    return index;
}