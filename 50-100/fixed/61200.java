@java.lang.Override
public void mouseMoved(java.awt.event.MouseEvent e) {
    int row = table.rowAtPoint(e.getPoint());
    if (row != (dirtyRow)) {
        editor.cancelCellEditing();
        table.repaint(table.getCellRect(dirtyRow, 0, true));
        dirtyRow = row;
        table.repaint(table.getCellRect(dirtyRow, 0, true));
    }
}