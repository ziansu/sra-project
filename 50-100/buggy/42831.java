public long pickYoung(double youngRatio) {
    long[] copy = java.util.Arrays.copyOf(lastViewedTick, lastViewedTick.length);
    java.util.Arrays.sort(copy);
    int length = copy.length;
    return copy[((length - 1) - (random.nextInt((1 + ((int) (youngRatio * length))))))];
}