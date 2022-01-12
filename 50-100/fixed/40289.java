@java.lang.Override
public java.awt.Component getTableCellRendererComponent(javax.swing.JTable table, java.lang.Object value, boolean isSelected, boolean hasFocus, int row, int column) {
    java.awt.Component ret = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    if (value != null) {
        selectValue(((int) (value)));
    }
    return ret;
}