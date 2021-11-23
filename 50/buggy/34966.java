private boolean contains(java.lang.String[] array, java.lang.String str) {
    for (java.lang.String array1 : array) {
        if (array1.equals(str)) {
            return true;
        }
    }
    return false;
}