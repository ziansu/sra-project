public void write(final com.valkryst.VTerminal.AsciiString string, final int columnIndex, final int rowIndex) {
    if (isPositionValid(columnIndex, rowIndex)) {
        final com.valkryst.VTerminal.AsciiCharacter[] characters = string.getCharacters();
        for (int i = 0; (i < (characters.length)) && (i < (super.getWidth())); i++) {
            write(characters[i], (columnIndex + i), rowIndex);
        }
    }
}