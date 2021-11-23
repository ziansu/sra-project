private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {
    int row = filtersTable.getSelectedRow();
    if (row < 0) {
        return ;
    }
    org.omegat.gui.filters2.FilterEditor editor = new org.omegat.gui.filters2.FilterEditor(this, editableFilters.getFilters().get(row));
    editor.setVisible(true);
    if ((editor.result) != null) {
        editableFilters.getFilters().set(row, editor.result);
    }
}