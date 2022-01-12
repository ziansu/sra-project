@java.lang.Override
public int compareTo(java.util.concurrent.Delayed delayed) {
    return java.lang.Long.compare(getDelay(java.util.concurrent.TimeUnit.NANOSECONDS), delayed.getDelay(java.util.concurrent.TimeUnit.NANOSECONDS));
}