public java.lang.String pop() throws java.lang.IndexOutOfBoundsException {
    if (isEmpty()) {
        throw new java.lang.IndexOutOfBoundsException();
    }else
        if ((size) <= ((arr.length) / 4)) {
            resize(((size) / 2));
        }
    
    java.lang.String item = arr[(--(size))];
    arr[size] = null;
    return item;
}