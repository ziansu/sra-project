private static int getStepCount(int x, java.util.Map<java.lang.Integer, java.lang.Integer> buffer) {
    if (x == 1) {
        return 1;
    }
    return (x % 2) == 0 ? (se.fredberg.euler.E014.getStepCount((x / 2), buffer)) + 1 : se.fredberg.euler.E014.getStepCount(((3 * x) + 1), buffer);
}