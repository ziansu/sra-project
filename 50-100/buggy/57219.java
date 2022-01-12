private void maybeWaitBeforeRetry() throws java.lang.InterruptedException {
    if ((currentWaitPeriod) <= 0)
        return ;
    
    if (isLogarithmicallyIncreasing)
        currentWaitPeriod += currentDelta /= 2;
    else
        currentWaitPeriod += waitPeriodIncrement;
    
    currentWaitPeriod = java.lang.Math.max(currentWaitPeriod, waitPeriodCap);
    java.lang.Thread.sleep(currentWaitPeriod);
}