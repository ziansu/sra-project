private static int calculateHpGen6(int level, int base, int iv, int ev) {
    if (base == 1) {
        return 1;
    }
    int base2 = base * 2;
    double ev4 = ev / 4;
    double level100 = ((double) (level)) / 100.0;
    double intermediate = ((iv + base2) + ev4) + 100;
    double intermediate2 = level100 * intermediate;
    int result = ((int) (intermediate2));
    return result + 10;
}