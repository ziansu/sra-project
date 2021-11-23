public static void quicksortH(int[] data, int start, int end) {
    if (start < end) {
        int[] bounds = Quick.part(data, start, end);
        Quick.quicksortH(data, start, ((bounds[0]) - 1));
        Quick.quicksortH(data, ((bounds[1]) + 1), end);
    }
}