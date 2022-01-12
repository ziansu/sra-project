@java.lang.Override
public java.awt.Component getTableCellEditorComponent(javax.swing.JTable table, java.lang.Object value, boolean isSelected, int row, int column) {
    if ((row % (buttonRow)) != 0) {
        this.editorValue = value;
        return null;
    }
    return super.getTableCellEditorComponent(table, value, isSelected, row, column);
}