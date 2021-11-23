public int removeLast() {
    if ((head) == null)
        throw new java.lang.RuntimeException("The LinkedList is Empty. Call from removeLast().");
    
    int temp = head.getElement();
    head = head.getNext();
    (size)--;
    return temp;
}