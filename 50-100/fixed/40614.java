public static java.lang.Object remove(ArrayQueueADT arrayQueueADT) {
    assert (arrayQueueADT.size) > 0;
    java.lang.Object o = ArrayQueueADT.peek(arrayQueueADT);
    arrayQueueADT.elements[((((arrayQueueADT.tail) - 1) + (arrayQueueADT.elements.length)) % (arrayQueueADT.elements.length))] = null;
    arrayQueueADT.tail = (((arrayQueueADT.tail) - 1) + (arrayQueueADT.elements.length)) % (arrayQueueADT.elements.length);
    (arrayQueueADT.size)--;
    return o;
}