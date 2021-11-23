protected java.awt.Component getRendererComponent(javax.swing.JTable table, java.lang.Object value, boolean isSelected, boolean hasFocus, int row, int col) {
    setSelectedItem(value);
    isSelected = table.isRowSelected(row);
    if (isSelected) {
        javax.swing.SwingUtilities.invokeLater(this.comboBoxFocusRequester);
        javax.swing.SwingUtilities.invokeLater(this.comboBoxOpener);
        return getComboBox();
    }
    return this.editor;
}