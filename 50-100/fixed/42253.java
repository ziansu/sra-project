public int[] countBits(int num) {
    int[] list = new int[num + 1];
    boolean isEven = true;
    for (int i = 0; i <= num; i++) {
        int j = list[(i >> 1)];
        list[i] = (isEven) ? j : j + 1;
        isEven = !isEven;
    }
    return list;
}