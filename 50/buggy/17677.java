public void removeHint() {
    if ((hintCell) != null) {
        hintCell.setHint(false);
        board.updateTable();
    }
}