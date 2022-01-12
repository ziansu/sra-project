private static <T extends java.lang.Comparable<? super T>> int findIndexOfNextSmallerItem(T[] a, T compare, int position) {
    if (position == (a.length))
        return -1;
    
    if ((a[position].compareTo(compare)) < 0)
        return position;
    
    return sorting.ArraySorterRecursive.findIndexOfNextSmallerItem(a, compare, (position + 1));
}