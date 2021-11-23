@java.lang.Override
public java.awt.Component getTableCellRendererComponent(javax.swing.JTable table, java.lang.Object text, boolean isSelected, boolean hasFocus, int row, int column) {
    super.getTableCellRendererComponent(table, text, isSelected, hasFocus, row, column);
    if (text instanceof java.lang.String) {
        setFont(italicFont);
        setBorder(plainBorder);
    }else {
        setFont(regularFont);
        setBorder(bulletBorder);
    }
    return this;
}