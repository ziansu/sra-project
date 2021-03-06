@java.lang.Override
public long roundKey(long utcMillis) {
    long timeLocal = utcMillis;
    timeLocal = timeZone.convertUTCToLocal(utcMillis);
    long rounded = Rounding.Interval.roundValue(Rounding.Interval.roundKey(timeLocal, interval), interval);
    return timeZone.convertLocalToUTC(rounded, true);
}