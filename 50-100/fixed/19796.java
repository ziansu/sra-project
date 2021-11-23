public void setFlippedVertically(final com.valkryst.VTerminal.misc.IntRange range, final boolean flipVertically) {
    checkRangeValidity(range);
    final int beginIndex = range.getStart();
    final int endIndex = range.getEnd();
    for (int columnIndex = beginIndex; columnIndex < endIndex; columnIndex++) {
        charactersToBeRedrawn[columnIndex] = flipVertically;
        characters[columnIndex].setFlippedVertically(true);
    }
}