public Item dequeue() {
    if (isEmpty())
        throw new java.util.NoSuchElementException("Stack underflow");
    
    Item dequeuedElement = stackArray[((head)--)];
    stackArray[((head) - 1)] = null;
    if (((head) - (tail)) == ((stackArray.length) / 4)) {
        resize(((stackArray.length) / 2));
    }
    return dequeuedElement;
}