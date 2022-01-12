private static void ensureCapacity(int capacity) {
    if (capacity <= (ArrayQueueModule.elements.length))
        return ;
    
    java.lang.Object[] newElements = new java.lang.Object[2 * capacity];
    for (int i = 0; i < (ArrayQueueModule.size); i++) {
        newElements[i] = ArrayQueueModule.elements[(((ArrayQueueModule.head) + i) % (ArrayQueueModule.elements.length))];
    }
    ArrayQueueModule.head = 0;
    ArrayQueueModule.tail = ArrayQueueModule.size;
    ArrayQueueModule.elements = newElements;
}