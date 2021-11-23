@java.lang.Override
public boolean hasNext() {
    nextCount = 0;
    return ((nonBottomHOffset) < (nonBottomHilbertValueCount)) || ((hOffset) < (hilbertValueCount));
}