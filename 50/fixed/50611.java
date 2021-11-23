public static java.lang.Object peek(ArrayQueueADT arrayQueueADT) {
    assert (arrayQueueADT.size) > 0;
    return arrayQueueADT.elements[((((arrayQueueADT.tail) - 1) + (arrayQueueADT.elements.length)) % (arrayQueueADT.elements.length))];
}