private boolean enqueue(T t) {
    final java.lang.Object[] elements = this.elements;
    elements[((tail)++)] = t;
    if ((tail) > (elements.length))
        tail = 0;
    
    (count)++;
    empty.signalAll();
    return true;
}