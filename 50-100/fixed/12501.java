@java.lang.Override
public E remove(int location) {
    location = location - 1;
    if (((location < (currentSize)) && (location >= 0)) && (!(isEmpty()))) {
        E obj = array[location];
        (currentSize)--;
        dynamicResize(false);
        shiftElements(location, false);
        return obj;
    }else {
        throw new java.lang.RuntimeException("Index is not within contiguous list");
    }
}