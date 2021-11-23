@java.lang.Override
public boolean inDaylightTime(java.util.Date time) {
    long when = time.getTime();
    long unix = when / 1000;
    int transition = java.util.Arrays.binarySearch(mTransitions, unix);
    if (transition < 0) {
        transition = (~transition) - 1;
        if (transition < 0) {
            return false;
        }
    }
    return (mIsDsts[((mTypes[transition]) & 255)]) == 1;
}