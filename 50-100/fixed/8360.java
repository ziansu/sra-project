public static void selectNextTableRow(javax.swing.JTable table) {
    int index = table.getSelectedRow();
    if (index == (-1)) {
        index = 0;
    }
    table.clearSelection();
    if ((++index) > ((table.getRowCount()) - 1)) {
        index = 0;
    }
    table.addRowSelectionInterval(index, index);
}