public void ensureCapacity(int capacity) {
    if (capacity <= (elements.length))
        return ;
    
    java.lang.Object[] newElements = new java.lang.Object[2 * capacity];
    for (int i = 0; i < (size); i++) {
        newElements[i] = elements[(((head) + i) % (elements.length))];
    }
    head = 0;
    tail = size;
    elements = newElements;
}