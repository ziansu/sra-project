public int getIndex(java.lang.String[] array, java.lang.String resource) {
    for (int i = 0; i < (array.length); i++) {
        if ((array[i]) == resource) {
            return i;
        }
    }
    return -1;
}