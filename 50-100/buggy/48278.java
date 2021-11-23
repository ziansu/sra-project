private int getContentWidth(int columnIndex) {
    int rowCount = getRowCount();
    int maxContentWidth = 0;
    for (int i = 0; i < rowCount; i++) {
        javax.swing.table.TableCellRenderer tableCellRenderer = getCellRenderer(i, columnIndex);
        java.awt.Component component = prepareRenderer(tableCellRenderer, i, columnIndex);
        int cellPreferredWidth = (component.getPreferredSize().width) + (getIntercellSpacing().width);
        maxContentWidth = java.lang.Math.max(maxContentWidth, cellPreferredWidth);
    }
    return maxContentWidth;
}