public static void enqueue(ArrayQueueADT arrayQueueADT, java.lang.Object o) {
    assert o != null;
    ArrayQueueADT.ensureCapacity(arrayQueueADT, ((arrayQueueADT.size) + 1));
    arrayQueueADT.elements[arrayQueueADT.tail] = o;
    arrayQueueADT.tail = ((arrayQueueADT.tail) + 1) % (arrayQueueADT.elements.length);
    (arrayQueueADT.size)++;
}