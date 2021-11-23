@java.lang.Override
public long roundKey(long utcMillis) {
    long time = utcMillis + (preTz.getOffset(utcMillis));
    return field.roundFloor(time);
}