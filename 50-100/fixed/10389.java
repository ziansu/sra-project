private final java.lang.Float calculateRate(final java.lang.Long counterValue, final java.lang.Long durationInNs, final java.util.concurrent.TimeUnit timeUnit) {
    java.lang.Float result = null;
    if (((counterValue != null) && (durationInNs != null)) && ((durationInNs.longValue()) > 0L)) {
        result = (counterValue * ((float) (java.util.concurrent.TimeUnit.NANOSECONDS.convert(1, timeUnit)))) / ((float) (durationInNs));
    }
    return result;
}