@java.lang.Override
public java.awt.Component prepareRenderer(javax.swing.table.TableCellRenderer renderer, int row, int column) {
    java.awt.Component c = super.prepareRenderer(renderer, row, column);
    if ((inventorysTableModel.getItemStock(row)) < (MIN_STOCK)) {
        c.setBackground(java.awt.Color.RED);
    }
    return c;
}