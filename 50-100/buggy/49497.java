private T dequeue() {
    final java.lang.Object[] elements = this.elements;
    if ((head) == (elements.length))
        head = 0;
    
    java.lang.Object object = elements[head];
    elements[((head)++)] = null;
    (count)--;
    full.signalAll();
    return ((T) (object));
}