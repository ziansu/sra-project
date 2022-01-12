public static int partition(int[] a, int p, int end) {
    int pivot = a[end];
    int lastKnownElementLessThanPivot = p - 1;
    for (int j = p; j < (end - 1); ++j) {
        if ((a[j]) <= pivot) {
            ++lastKnownElementLessThanPivot;
            edu.evansdaniel.collections.SortingUtils.swap(a, lastKnownElementLessThanPivot, j);
        }
    }
    edu.evansdaniel.collections.SortingUtils.swap(a, (lastKnownElementLessThanPivot + 1), end);
    return lastKnownElementLessThanPivot + 1;
}