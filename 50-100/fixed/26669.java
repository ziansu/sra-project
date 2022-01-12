private static int getStepCount(long x, java.util.Map<java.lang.Integer, java.lang.Integer> buffer) {
    if (x == 1) {
        return 1;
    }
    if ((x % 2) == 0) {
        return (se.fredberg.euler.E014.getStepCount((x / 2), buffer)) + 1;
    }
    return se.fredberg.euler.E014.getStepCount(((3 * x) + 1), buffer);
}