public static void enqueue(ArrayQueueADT arrayQueueADT, java.lang.Object o) {
    ArrayQueueADT.ensureCapacity(arrayQueueADT, ((arrayQueueADT.size) + 1));
    arrayQueueADT.elements[((arrayQueueADT.tail)++)] = o;
    arrayQueueADT.tail %= arrayQueueADT.elements.length;
    (arrayQueueADT.size)++;
}