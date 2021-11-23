@java.lang.Override
public long estimateSize() {
    int outerLength = (endOuterExclusive) - (startOuterInclusive);
    if (outerLength <= 0) {
        return 0;
    }
    return (((innerLength) * (outerLength - 1)) + (endInnerExclusive)) - (startInnerInclusive);
}