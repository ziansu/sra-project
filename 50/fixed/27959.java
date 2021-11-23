public final void writeValuesToRow() {
    writeRow(java.util.Arrays.copyOf(partialLine, ((partialLineIndex) + 1)));
    partialLineIndex = 0;
}