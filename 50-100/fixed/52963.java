public int get() {
    int accumulator = 0;
    synchronized(samples) {
        samples.headSet(new me.shreyasr.ancients.util.TimeBasedRollingAverage.Sample(((java.lang.System.currentTimeMillis()) - (millis)), 0)).clear();
        for (me.shreyasr.ancients.util.TimeBasedRollingAverage.Sample sample : samples) {
            accumulator += sample.val;
        }
    }
    return accumulator;
}