public static long calcWindow(long windowLength_s, long windowAdvance_s, long initTimestamp, long timestamp) {
    long window = windowLength_s;
    long newTimestamp = timestamp - initTimestamp;
    if ((windowLength_s - newTimestamp) >= 0) {
        window = windowLength_s + ((((newTimestamp - windowLength_s) / windowAdvance_s) + 1) * windowAdvance_s);
    }
    return window;
}