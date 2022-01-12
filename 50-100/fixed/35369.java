public int runAll() {
    int sum = 0;
    for (int i = 0; i < (((coreSize) - (p1size)) - (p2size)); i++) {
        sum += (run(i)) - 1;
    }
    return sum;
}