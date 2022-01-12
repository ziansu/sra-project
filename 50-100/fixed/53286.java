public static void sortH(int[] data, int start, int end) {
    if ((end - start) > 1) {
        int[] part = Quick.part(data, start, end);
        Quick.sortH(data, start, ((part[0]) - 1));
        Quick.sortH(data, ((part[1]) + 1), end);
    }
}