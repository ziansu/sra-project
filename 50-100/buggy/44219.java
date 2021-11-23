@java.lang.Override
public long setDouble(long flags, int key, double value) {
    if (key == (K_DELAY)) {
        delayEncoder.setDoubleValue(flags, value);
    }else {
        throw new java.lang.UnsupportedOperationException((("Unknown key " + key) + " for double value."));
    }
    return flags;
}