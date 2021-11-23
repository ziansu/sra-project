private T dequeue() {
    final java.lang.Object[] elements = this.elements;
    java.lang.Object object = elements[head];
    elements[((head)++)] = null;
    if ((head) == (elements.length))
        head = 0;
    
    (count)--;
    full.signalAll();
    return ((T) (object));
}