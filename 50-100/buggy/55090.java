private void categoryTableMouseClicked(java.awt.event.MouseEvent evt) {
    int selectedRow = categoryTable.getSelectedRow();
    dtm = ((javax.swing.table.DefaultTableModel) (categoryTable.getModel()));
    if (selectedRow != (-1)) {
        itemCodeTextField.setText(dtm.getValueAt(categoryTable.getSelectedRow(), 0).toString());
        categoryTextField.setText(dtm.getValueAt(categoryTable.getSelectedRow(), 1).toString());
    }
}