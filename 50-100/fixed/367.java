private <T extends java.lang.Comparable<T>> boolean checkSorted(T[] array) {
    for (int i = 1; i < (array.length); i++) {
        if ((array[(i - 1)].compareTo(array[i])) > 0) {
            return false;
        }
    }
    return true;
}