public void put(int value) {
    synchronized(samples) {
        samples.add(new me.shreyasr.ancients.util.TimeBasedRollingAverage.Sample(java.lang.System.currentTimeMillis(), value));
    }
}