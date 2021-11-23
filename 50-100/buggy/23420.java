public E[] peekAll(E[] array) {
    if ((marker) == 0) {
        throw new java.lang.IllegalStateException();
    }else {
        int length = java.lang.Math.min(((size) - (marks[((marker) - 1)])), array.length);
        java.lang.System.arraycopy(elements, ((size) - length), array, 0, length);
        return array;
    }
}