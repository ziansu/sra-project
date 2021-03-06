@java.lang.Override
public long nextRoundingValue(long time) {
    long timeLocal = time;
    timeLocal = timeZone.convertUTCToLocal(time);
    long nextInLocalTime = durationField.add(timeLocal, 1);
    return timeZone.convertLocalToUTC(nextInLocalTime, false);
}