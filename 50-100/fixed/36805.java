public static void enqueue(java.lang.Object o) {
    assert o != null;
    ArrayQueueModule.ensureCapacity(((ArrayQueueModule.size) + 1));
    ArrayQueueModule.elements[ArrayQueueModule.tail] = o;
    ArrayQueueModule.tail = ((ArrayQueueModule.tail) + 1) % (ArrayQueueModule.elements.length);
    (ArrayQueueModule.size)++;
}