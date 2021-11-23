public void mousePressed(java.awt.event.MouseEvent e) {
    if ((e.getButton()) == (java.awt.event.MouseEvent.BUTTON3)) {
        popup.show(table, e.getX(), e.getY());
        int row = table.rowAtPoint(e.getPoint());
        removeItem.setText(("Mark person unavailable for " + (utilities.Utilities.getDisplayDate(calendar))));
        table.getSelectionModel().setSelectionInterval(row, row);
    }
}