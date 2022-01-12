public T removeFront() {
    java.lang.System.out.println(count);
    if ((count) == 0)
        throw new java.util.NoSuchElementException();
    
    T temp = front.getValue();
    front = front.getNext();
    if ((--(count)) > 0)
        front.prev = null;
    else {
        front = rear = null;
    }
    return temp;
}