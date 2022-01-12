public static void ensureCapacity(ArrayQueueADT arrayQueueADT, int capacity) {
    if (capacity <= (arrayQueueADT.elements.length))
        return ;
    
    java.lang.Object[] newElements = new java.lang.Object[2 * capacity];
    for (int i = 0; i < (arrayQueueADT.size); i++) {
        newElements[i] = arrayQueueADT.elements[(((arrayQueueADT.head) + i) % (arrayQueueADT.elements.length))];
    }
    arrayQueueADT.head = 0;
    arrayQueueADT.tail = arrayQueueADT.size;
    arrayQueueADT.elements = newElements;
}