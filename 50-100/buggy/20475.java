public boolean shouldWait(double currentTime) {
    double delta = (getWaitForTime()) - currentTime;
    boolean shouldWait = delta > (getEpsilon());
    if ((!shouldWait) && (delta > 0)) {
        if (org.commonreality.time.impl.BasicClock.LOGGER.isWarnEnabled())
            org.commonreality.time.impl.BasicClock.LOGGER.warn(java.lang.String.format("Adjusting time shift by %.5f", delta));
        
        setTimeShift(((getTimeShift()) + delta));
    }
    return shouldWait;
}