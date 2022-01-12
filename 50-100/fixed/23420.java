public E[] peekAll(E[] array) {
    int length = java.lang.Math.min(((marker) == 0 ? size : (size) - (marks[((marker) - 1)])), array.length);
    java.lang.System.arraycopy(elements, ((size) - length), array, 0, length);
    return array;
}