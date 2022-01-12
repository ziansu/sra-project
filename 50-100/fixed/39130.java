@java.lang.Override
public void run() {
    int rowAtPoint = booksTable.rowAtPoint(javax.swing.SwingUtilities.convertPoint(booksPopupMenu, new java.awt.Point(0, 0), booksTable));
    if (rowAtPoint > (-1)) {
        booksTable.setRowSelectionInterval(rowAtPoint, rowAtPoint);
    }
}