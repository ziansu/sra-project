public T removeFirst() {
    cn.young.ds.LinkedList<T>.Node tmp = first;
    if (tmp == null)
        return null;
    
    T item = tmp.record;
    first = tmp.next;
    if (isEmpty()) {
        last = null;
    }
    tmp = null;
    (size)--;
    return item;
}