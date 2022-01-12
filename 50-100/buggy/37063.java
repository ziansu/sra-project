@java.lang.Override
public long intervalEnd() {
    long difference = ((maxIndex) - (index)) + 1;
    if (difference == 0) {
        return 0;
    }else {
        return -((remainderNanos) + ((difference - 1) * (nanosPerSlot)));
    }
}