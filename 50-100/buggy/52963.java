public int get() {
    samples.headSet(new me.shreyasr.ancients.util.TimeBasedRollingAverage.Sample(((java.lang.System.currentTimeMillis()) - (millis)), 0)).clear();
    int accumulator = 0;
    for (me.shreyasr.ancients.util.TimeBasedRollingAverage.Sample sample : samples) {
        accumulator += sample.val;
    }
    return accumulator;
}