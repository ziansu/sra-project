@java.lang.Override
public void insert(E obj, int location) {
    if ((location - 1) < (currentSize)) {
        (currentSize)++;
        dynamicResize(true);
        shiftElements((location - 1), true);
        array[(location - 1)] = obj;
    }else {
        throw new java.lang.RuntimeException("Index is not within contiguous list");
    }
}