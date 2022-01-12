public void fastInsert(T element) {
    (inserted)++;
    if ((size) < ((maxSize) - 1)) {
        elements[(++(size))] = serialize(element);
        dirty = true;
    }else
        if (((size) > 0) && (!(lessThan(element, elements[1])))) {
            orderHeap();
            elements[1] = serialize(element);
            downHeap();
        }
    
}