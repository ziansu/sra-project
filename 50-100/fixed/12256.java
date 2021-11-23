private static int[] quickSortH(int[] data, int start, int end) {
    if (start < end) {
        int index = Quick.part(data, start, end);
        Quick.quickSortH(data, start, index);
        Quick.quickSortH(data, (index + 1), end);
    }
    return data;
}