public static java.lang.Object remove(ArrayQueueADT arrayQueueADT) {
    java.lang.Object o = ArrayQueueADT.peek(arrayQueueADT);
    arrayQueueADT.tail = (((arrayQueueADT.tail) - 1) + (arrayQueueADT.elements.length)) % (arrayQueueADT.elements.length);
    (arrayQueueADT.size)--;
    return o;
}