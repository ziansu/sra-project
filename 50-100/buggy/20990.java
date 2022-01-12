public int format(final long time, final char[] buffer, int startPos) {
    final int ms = ((int) (millisSinceMidnight(time)));
    writeDate(buffer);
    return (writeTime(ms, buffer, (startPos + (dateLength)))) - startPos;
}