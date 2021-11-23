@java.lang.Override
public E removeLast() {
    if ((currentSize) != 0) {
        E temp = array[((currentSize) - 1)];
        (currentSize)--;
        dynamicResize(false);
        return temp;
    }
    return null;
}