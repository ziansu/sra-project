@java.lang.Override
public long nextRoundingValue(long time) {
    long currentWithoutPostZone = postTz.convertLocalToUTC(time, false);
    long local = preTz.convertUTCToLocal(currentWithoutPostZone);
    long nextLocal = durationField.add(local, 1);
    return postTz.convertUTCToLocal(preTz.convertLocalToUTC(nextLocal, false));
}