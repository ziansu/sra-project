@java.lang.Override
public long startExcerpt(int capacity) {
    long startPosition = getIndexData(size);
    assert ((size) > 0) || (startPosition != 0);
    if ((startPosition & (~(dataLowMask))) != ((startPosition + capacity) & (~(dataLowMask)))) {
        startPosition = (startPosition + (dataLowMask)) & (~(dataLowMask));
        setIndexData(size, startPosition);
    }
    return startPosition;
}