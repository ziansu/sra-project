private static long findMask(int position) {
    long result = 1;
    for (int i = 0; i < (45 - position); i++) {
        result *= 2;
    }
    return result;
}