public int format(final long time, final char[] buffer, final int startPos) {
    final int ms = ((int) (millisSinceMidnight(time)));
    writeDate(buffer, startPos);
    return (writeTime(ms, buffer, (startPos + (dateLength)))) - startPos;
}