public java.lang.String getToolTipText(java.awt.event.MouseEvent e) {
    java.lang.String tip = null;
    java.awt.Point p = e.getPoint();
    int index = columnModel.getColumnIndexAtX(p.x);
    if (index < 0) {
        return null;
    }
    int realIndex = columnModel.getColumn(index).getModelIndex();
    tip = ((net.sf.openrocket.gui.adaptors.ColumnTableModel) (getModel())).getColumn(realIndex).getToolTip();
    return tip;
}