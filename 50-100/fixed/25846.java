public T removeFirst() {
    if (isEmpty())
        return null;
    
    cn.young.ds.LinkedList<T>.Node tmp = first;
    T item = tmp.record;
    first = tmp.next;
    (size)--;
    if (isEmpty()) {
        last = null;
    }
    tmp = null;
    return item;
}