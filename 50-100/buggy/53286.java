public static void sortH(int[] data, int start, int end) {
    int[] part = Quick.part(data, start, end);
    if ((end - start) < 2) {
        return ;
    }else {
        Quick.sortH(data, start, ((part[0]) - 1));
        Quick.sortH(data, ((part[1]) + 1), end);
    }
}