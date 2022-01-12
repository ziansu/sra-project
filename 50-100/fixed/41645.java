private void stepToThreshold(long nextThreshold) {
    long diff = nextThreshold - (threshold.getMillis());
    double multi = diff / (1000.0 * (batchLength));
    int multiplier = (multi < 1) ? 1 : ((int) (java.lang.Math.floor(multi)));
    threshold = threshold.plusSeconds(((batchLength) * multiplier));
}