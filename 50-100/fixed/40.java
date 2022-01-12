public static java.lang.String stripPath(final int p, final java.lang.String s) {
    if (p <= 0) {
        return s;
    }
    int x = 0;
    for (int i = 0; i < p; i++) {
        x = s.indexOf('/', (x + 1));
        if (x < 0) {
            return s;
        }
    }
    return s.substring((x + 1));
}