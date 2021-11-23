public static <T extends java.lang.Comparable<? super T>> T select(T[] array, java.util.Comparator<? super T> c, int k) {
    return array[io.marmot.laboratory.algorithm.KthSelector.select(array, c, 0, ((array.length) - 1), k)];
}