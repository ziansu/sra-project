private static java.util.Date convertEpochToReadable(long epoch) {
    java.util.Date d = new java.util.Date((epoch * 1000));
    return d;
}