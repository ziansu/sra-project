private void updateBrowserView() {
    showing = control.doSearch(txtSearchText.getText());
    javax.swing.table.DefaultTableModel model = ((javax.swing.table.DefaultTableModel) (tblUserList.getModel()));
    int rows = model.getRowCount();
    for (int i = rows - 1; i >= 0; i--) {
        model.removeRow(i);
    }
    for (User u : showing) {
        addRow(u, model);
    }
}