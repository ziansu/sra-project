public java.awt.Component prepareRenderer(javax.swing.table.TableCellRenderer renderer, int row, int column) {
    java.awt.Component c = super.prepareRenderer(renderer, row, column);
    if (!(isRowSelected(row)))
        c.setBackground(((row % 2) != 0 ? getBackground() : java.awt.Color.LIGHT_GRAY));
    
    return c;
}