public long pickYoung(double youngRatio) {
    long[] copy = java.util.Arrays.copyOf(lastViewedTick, lastViewedTick.length);
    java.util.Arrays.sort(copy);
    return copy[(((copy.length) - 1) - (random.nextInt((1 + ((int) (youngRatio * (copy.length)))))))];
}