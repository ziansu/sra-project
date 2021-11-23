@java.lang.Override
public java.awt.Component getTableCellEditorComponent(javax.swing.JTable table, java.lang.Object value, boolean isSelected, int row, int column) {
    this.value = ((org.rr.jeborker.db.item.EbookPropertyItem) (value));
    final java.awt.Component tableCellComponent = renderer.getTableCellComponent(table, value, true, true, row, column);
    if ((editListener) != null) {
        editListener.editingStarted();
    }
    return tableCellComponent;
}