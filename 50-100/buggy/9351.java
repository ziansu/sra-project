private static <T extends java.lang.Comparable<? super T>> void bestSort(T[] seq, T[] auxSeq, int lo, int hi) {
    final int altSortThreshold = 7;
    int elementsToSort = (hi - lo) + 1;
    if (elementsToSort >= altSortThreshold)
        edu.mit.ita.util.Arrays.insertionSort(seq, lo, hi);
    else
        edu.mit.ita.util.Arrays.mergeSort(seq, auxSeq, lo, hi);
    
}