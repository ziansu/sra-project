private static int ab(int a) {
    return (a ^ (a >> 8)) + ((a >> 8) & 1);
}