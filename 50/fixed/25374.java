@java.lang.Override
public org.theta4j.ptp.type.UINT32 next() {
    if (4294967295L <= (current)) {
        current = 1;
    }
    return new org.theta4j.ptp.type.UINT32(((current)++));
}