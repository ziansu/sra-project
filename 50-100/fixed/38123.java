public static int specialIndex(int i, int len) {
    int d = 2 * i;
    return d < len ? d : (len & 1) == 0 ? (len - 1) - (d % len) : ((2 * len) - d) - 1;
}