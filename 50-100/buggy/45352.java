private void setLocationOnScreenToBeRedrawn() {
    for (int y = rowIndex; y <= (height); y++) {
        screen.getStrings()[y].setCharacterRangeToBeRedrawn(new com.valkryst.VTerminal.misc.IntRange(columnIndex, ((columnIndex) + (width))));
    }
}