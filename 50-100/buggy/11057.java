public void add(int index, double element) {
    boundsCheck(index);
    enlageIfNeeded(1);
    java.lang.System.arraycopy(array, index, array, (index + 1), ((size()) - index));
    set(index, element);
    increasedSize(1);
}