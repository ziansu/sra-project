public void write(final char character, final int columnIndex, final int rowIndex) {
    if ((isPositionValid(columnIndex, rowIndex)) == false) {
        strings[rowIndex].setCharacter(columnIndex, character);
    }
}