private static java.lang.String millisToTimeString(long millis) {
    long seconds = millis / 1000;
    long s = seconds % 60;
    long m = (seconds / 60) % 60;
    long h = seconds / (60 * 60);
    return java.lang.String.format("%02d:%02d:%02d", h, m, s);
}