@java.lang.Override
public int getOffset(long when) {
    long unix = when / 1000;
    int transition = java.util.Arrays.binarySearch(mTransitions, unix);
    if (transition < 0) {
        transition = (~transition) - 1;
        if (transition < 0) {
            return mEarliestRawOffset;
        }
    }
    return (mRawOffset) + ((mOffsets[((mTypes[transition]) & 255)]) * 1000);
}