private static int calculateHpGen6(int level, int base, int iv, int ev) {
    if (base == 1) {
        return 1;
    }
    double result = (((((iv + (2 * base)) + (ev / 4)) + 100) * level) / 100) + 10;
    return ((int) (result));
}