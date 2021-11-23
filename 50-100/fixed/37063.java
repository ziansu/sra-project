@java.lang.Override
public long intervalEnd() {
    long difference = (maxIndex) - (index);
    if (difference == (-1)) {
        return 0;
    }else {
        return -((remainderNanos) + (difference * (nanosPerSlot)));
    }
}