private void expand() {
    int size = getSize();
    java.lang.Object[] newArray = new java.lang.Object[(size == 0 ? 1 : size) * 2];
    java.lang.System.arraycopy(array, 0, newArray, 0, getSize());
    array = newArray;
}