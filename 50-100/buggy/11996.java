public java.lang.String[] removeEntry(java.lang.String[] arrayToRemoveFrom, int entryNumber) {
    java.lang.String[] result = new java.lang.String[(arrayToRemoveFrom.length) - 1];
    int tmp = 0;
    for (int i = 0; i < (result.length); i++) {
        if (i == entryNumber) {
            tmp = 1;
        }else {
            result[i] = arrayToRemoveFrom[(i + tmp)];
        }
    }
    return result;
}