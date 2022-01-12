@java.lang.Override
public void run() {
    int rowAtPoint = authorsTable.rowAtPoint(javax.swing.SwingUtilities.convertPoint(booksPopupMenu, new java.awt.Point(0, 0), authorsTable));
    if (rowAtPoint > (-1)) {
        booksTable.setRowSelectionInterval(rowAtPoint, rowAtPoint);
    }
}