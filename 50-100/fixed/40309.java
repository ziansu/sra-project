public void tick() {
    final long count = uncounted.sumThenReset();
    final double instantRate = count / (interval);
    if (instantRate > (peakRate)) {
        peakRate = instantRate;
    }
    if (initialized) {
        rate += (alpha) * (instantRate - (rate));
    }else {
        rate = instantRate;
        initialized = true;
        peakRate = instantRate;
    }
}