private static long findMask(int position) {
    return 1L << ((long) (45 - position));
}