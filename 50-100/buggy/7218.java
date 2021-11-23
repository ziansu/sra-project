public void add(int index, long element) {
    boundsCheck(index);
    enlargeIfNeeded(1);
    java.lang.System.arraycopy(array, index, array, (index + 1), ((end) - index));
    array[index] = element;
}