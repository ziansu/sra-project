private void changeVisualCharacter(final int columnIndex, final int rowIndex, final char character) {
    if ((columnIndex < 0) || (columnIndex > (maxHorizontalCharacters))) {
        return ;
    }
    if ((rowIndex < 0) || (rowIndex > (maxVerticalCharacters))) {
        return ;
    }
    final com.valkryst.VTerminal.AsciiCharacter[] characters = super.getString(rowIndex).getCharacters();
    characters[columnIndex].setCharacter(character);
}