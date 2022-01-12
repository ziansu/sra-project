protected void updateTable(javax.swing.table.DefaultTableModel tableModel, java.util.Vector<java.util.Vector<java.lang.String>> rowData) {
    while ((tableModel.getRowCount()) > 0) {
        tableModel.removeRow(0);
    } 
    for (int i = 0; i < (rowData.size()); i++) {
        tableModel.addRow(rowData.get(i));
    }
}