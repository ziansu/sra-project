private void delayBy(long delay) {
    if (delay > 0) {
        long start = java.lang.System.currentTimeMillis();
        long end = start + delay;
        long now = 0;
        long pause = org.apache.jmeter.threads.ThreadGroup.RAMPUP_GRANULARITY;
        while ((running) && ((now = java.lang.System.currentTimeMillis()) < end)) {
            long togo = end - now;
            if (togo < pause) {
                pause = togo;
            }
            pause(pause);
        } 
    }
}