<T extends java.lang.Comparable<T>> void doTest(T[] input, T[] expected) {
    java.util.List<T> list = java.util.Arrays.asList(input);
    org.apache.pdfbox.util.QuickSort.sort(list);
    boolean equal = java.util.Arrays.equals(list.toArray(new java.lang.Object[input.length]), expected);
    assertTrue(equal);
}