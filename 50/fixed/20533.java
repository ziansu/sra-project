public org.apache.spark.util.collection.unsafe.sort.UnsafeInMemorySorter.SortedIterator getSortedIterator() {
    if ((sortComparator) != null) {
        sorter.sort(array, 0, ((pos) / 2), sortComparator);
    }
    return new org.apache.spark.util.collection.unsafe.sort.UnsafeInMemorySorter.SortedIterator(((pos) / 2));
}