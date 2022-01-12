private int getArrayIndexWithString(java.lang.String stringToSearch, java.lang.String[] array) {
    int index = 0;
    for (java.lang.String string : array) {
        if (string.startsWith(stringToSearch)) {
            return index;
        }
        index++;
    }
    return -1;
}