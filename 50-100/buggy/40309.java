public void tick() {
    java.lang.System.out.printf("tick\n");
    final long count = uncounted.sumThenReset();
    final double instantRate = count / (interval);
    if (instantRate > (peakRate)) {
        java.lang.System.out.printf("INc-tick\n");
        peakRate = instantRate;
    }
    if (initialized) {
        rate += (alpha) * (instantRate - (rate));
    }else {
        rate = instantRate;
        initialized = true;
    }
}