public static <T> void mergeSort(T[] array, java.util.Comparator<T> comparator, int fromIndex, int toIndex) {
    if (fromIndex >= toIndex) {
        return ;
    }
    int breakingPoint = (fromIndex + toIndex) / 2;
    com.lopina.important.take2.mergeSort.MergeSort.mergeSort(array, comparator, fromIndex, breakingPoint);
    com.lopina.important.take2.mergeSort.MergeSort.mergeSort(array, comparator, (breakingPoint + 1), toIndex);
    com.lopina.important.take2.mergeSort.MergeSort.merge(array, comparator, fromIndex, breakingPoint, (breakingPoint + 1), toIndex);
}