private void setLocationOnScreenToBeRedrawn() {
    for (int y = rowIndex; y <= ((rowIndex) + (height)); y++) {
        screen.getStrings()[y].setCharacterRangeToBeRedrawn(new com.valkryst.VTerminal.misc.IntRange(columnIndex, ((columnIndex) + (width))));
    }
    java.lang.System.out.println();
}