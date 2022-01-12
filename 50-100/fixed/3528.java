private static void quicksort(int[] ary, int si, int ei) {
    if ((ei - si) > 1) {
        int pivotIndex = Quick.partition(ary, si, ei, ((int) (((java.lang.Math.random()) * ((ei - si) - 1)) + si)));
        Quick.quicksort(ary, si, pivotIndex);
        Quick.quicksort(ary, (pivotIndex + 1), ei);
    }
}