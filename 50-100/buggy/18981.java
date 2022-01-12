@java.lang.Override
public long estimateSize() {
    int outerLength = (endOuterExclusive) - (startOuterInclusive);
    if (outerLength <= 0) {
        throw new java.lang.NegativeArraySizeException("startOuterInclusive == endOuterExclusive");
    }
    return (((innerLength) * (outerLength - 1)) + (endInnerExclusive)) - (startInnerInclusive);
}