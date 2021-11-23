public int compareTo(java.util.concurrent.Delayed other) {
    if (other == (this))
        return 0;
    
    long d = (getDelay(java.util.concurrent.TimeUnit.NANOSECONDS)) - (other.getDelay(java.util.concurrent.TimeUnit.NANOSECONDS));
    return d == 0 ? 0 : d < 0 ? -1 : 1;
}