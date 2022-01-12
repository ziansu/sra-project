private <T extends java.lang.Comparable<T>> void checkSorted(T[] array) {
    for (int i = 1; i < (array.length); i++) {
        org.junit.Assert.assertTrue(((array[(i - 1)].compareTo(array[i])) <= 0));
    }
}