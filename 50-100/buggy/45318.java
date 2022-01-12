private void startEditingNextRow(final javax.swing.JTable statsTable, final int col, final int nextRow, javax.swing.JTextField textField) {
    if ((((nextRow >= 0) && (nextRow < (statsTable.getModel().getRowCount()))) && (col >= 0)) && (col < (statsTable.getModel().getColumnCount()))) {
        statsTable.editCellAt(nextRow, col);
        textField.requestFocusInWindow();
    }
}