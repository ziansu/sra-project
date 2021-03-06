@java.lang.Override
public long valueForKey(long key) {
    long time = Rounding.Interval.roundValue(key, interval);
    time = preTz.convertLocalToUTC(time, false);
    time = postTz.convertUTCToLocal(time);
    return time;
}