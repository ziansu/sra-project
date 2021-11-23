@java.lang.Override
public long valueForKey(long time) {
    time = time + (postTz.getOffset(time));
    return time;
}