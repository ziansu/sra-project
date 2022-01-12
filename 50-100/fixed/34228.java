public void fastInsert(T element) {
    (inserted)++;
    if ((size) < ((maxSize) - 1)) {
        elements[(++(size))] = serialize(element);
        dirty = true;
    }else {
        orderHeap();
        if (lessThan(element, elements[1])) {
            return ;
        }
        elements[1] = serialize(element);
        downHeap();
    }
}