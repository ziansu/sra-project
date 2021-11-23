@java.lang.Override
public long nextRoundingValue(long currentWithPostZone) {
    long currentWithoutPostZone = postTz.convertLocalToUTC(currentWithPostZone, true);
    long nextWithoutPostZone = durationField.add(currentWithoutPostZone, 1);
    return postTz.convertUTCToLocal(nextWithoutPostZone);
}