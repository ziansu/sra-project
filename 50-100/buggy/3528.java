private static void quicksort(int[] ary, int si, int ei) {
    int pivotIndex = Quick.partition(ary, si, ei, ((int) (((java.lang.Math.random()) * ((ei - si) - 1)) + si)));
    if ((ei - si) > 2) {
        Quick.quicksort(ary, si, pivotIndex);
        Quick.quicksort(ary, (pivotIndex + 1), ei);
    }
}