private static long[] extractTimeval(org.python.core.PyObject seconds) {
    long[] timeval = new long[]{ jnr.posix.util.Platform.IS_32_BIT ? seconds.asInt() : seconds.asLong() , 0L };
    if (seconds instanceof org.python.core.PyFloat) {
        long usec = ((long) (((seconds.asDouble()) - (timeval[0])) * 1000000.0));
        if (usec < 0) {
            usec = 0;
        }
        timeval[1] = usec;
    }
    return timeval;
}