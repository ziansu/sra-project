public Item pop() throws java.lang.IndexOutOfBoundsException {
    if (isEmpty()) {
        throw new java.lang.IndexOutOfBoundsException();
    }else
        if ((size) <= ((arr.length) / 4)) {
            resize(((arr.length) / 2));
        }
    
    Item item = arr[(--(size))];
    arr[size] = null;
    return item;
}