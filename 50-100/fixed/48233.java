@java.lang.Override
public java.awt.Component getTableCellRendererComponent(javax.swing.JTable table, java.lang.Object value, boolean isSelected, boolean hasFocus, int row, int column) {
    if (column == 0) {
        orderColor = getOrderColor(((int) (value)));
    }
    setForeground(java.awt.Color.BLACK);
    setBackground(orderColor);
    return this;
}