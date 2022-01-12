public void setFlippedHorizontally(final com.valkryst.VTerminal.misc.IntRange range, final boolean flipHorizontally) {
    checkRangeValidity(range);
    final int beginIndex = range.getStart();
    final int endIndex = range.getEnd();
    for (int columnIndex = beginIndex; columnIndex < endIndex; columnIndex++) {
        charactersToBeRedrawn[columnIndex] = true;
        characters[columnIndex].setFlippedHorizontally(flipHorizontally);
    }
}