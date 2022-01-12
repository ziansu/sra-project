@java.lang.Override
public E removeFirst() {
    if (!(isEmpty())) {
        E temp = array[0];
        (currentSize)--;
        dynamicResize(false);
        shiftElements(0, false);
        return temp;
    }
    return null;
}