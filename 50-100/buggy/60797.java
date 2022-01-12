public static int removeSelectedRows(javax.swing.JTable jTable) {
    int[] selectedRows = jTable.getSelectedRows();
    if ((selectedRows.length) > 0) {
        javax.swing.table.DefaultTableModel dtm = ((javax.swing.table.DefaultTableModel) (jTable.getModel()));
        for (int i = (selectedRows.length) - 1; i >= 0; i++) {
            dtm.removeRow(selectedRows[i]);
        }
    }
    return selectedRows.length;
}