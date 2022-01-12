public E removeTail() {
    tempData = tail.data;
    if ((tail) != (head)) {
        tail = tail.prev;
        tail.next = null;
    }else {
        tail = null;
    }
    (size)--;
    return tempData;
}