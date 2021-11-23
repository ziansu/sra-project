public void remove(int index) {
    if ((index < 0) || (index >= (size)))
        throw new java.lang.IndexOutOfBoundsException("the index is not within the range");
    
    for (int i = index; i < (size); i++) {
        array[i] = array[(i + 1)];
    }
    array[((size) - 1)] = null;
    (size)--;
}