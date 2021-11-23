public static int range(int from, int to) {
    if (to < from) {
        throw new java.lang.IllegalArgumentException(((("to must be higher than from (from: " + from) + ", to:") + to));
    }
    return ((int) ((java.lang.Math.round(((java.lang.Math.random()) * (to - from)))) + to));
}