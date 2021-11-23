private static java.util.Date computeEffectiveTime(be.raildelays.domain.entities.TimestampDelay timestampDelay) {
    java.util.Date result = null;
    if ((timestampDelay != null) && ((timestampDelay.getExpected()) != null)) {
        result = org.apache.commons.lang.time.DateUtils.addMinutes(timestampDelay.getExpected(), ((timestampDelay.getDelay()) != null ? timestampDelay.getDelay().intValue() : 0));
    }
    return result;
}