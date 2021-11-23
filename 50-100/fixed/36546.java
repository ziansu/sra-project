private static void quickSortH(int[] data, int start, int end) {
    if ((data.length) == 0) {
        return ;
    }
    if (start < end) {
        int piv = Quick.part(data, start, end);
        Quick.quickSortH(data, start, (piv - 1));
        Quick.quickSortH(data, (piv + 1), end);
    }
}