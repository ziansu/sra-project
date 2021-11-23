@java.lang.Override
public int init(final double[] theData, final int theOffset) {
    int len = (rows) * (columns);
    initHelper(theData, theOffset, len);
    return theOffset + len;
}