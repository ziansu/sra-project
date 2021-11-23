public Item pop() {
    if (isEmpty())
        throw new java.util.NoSuchElementException("Stack underflow");
    
    Item oldFirst = first.item;
    first = first.next;
    (this.numElements)--;
    return oldFirst;
}