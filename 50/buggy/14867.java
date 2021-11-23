private void checkValidColumn() {
    int columnToRemove = board.checkValidColumn(buttons);
    java.lang.System.out.println((columnToRemove + " A"));
    if (columnToRemove != (-1)) {
        buttons[columnToRemove].setEnabled(false);
    }
}