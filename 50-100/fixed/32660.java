public Item pop() throws java.util.EmptyStackException {
    if (((index) == (-1)) || ((array[index]) == null)) {
        throw new java.util.EmptyStackException();
    }
    Item item = array[index];
    array[index] = null;
    if ((index) == 0) {
        index = (array.length) - 1;
    }else {
        index = (index) - 1;
    }
    return item;
}