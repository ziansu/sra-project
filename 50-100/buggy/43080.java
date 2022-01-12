public void add(int index, int element) {
    if (index == (size())) {
        add(element);
    }else {
        boundsCheck(index);
        enlargeIfNeeded(1);
        java.lang.System.arraycopy(array, index, array, (index + 1), ((end) - index));
        array[index] = element;
    }
}