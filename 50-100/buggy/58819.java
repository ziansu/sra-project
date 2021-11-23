public void mouseClicked(java.awt.event.MouseEvent e) {
    int row = table.rowAtPoint(e.getPoint());
    java.lang.String name = names.get((row - 1));
    int id = ids.get((row - 1));
    SetupReviewTable(id, name);
}