public void mouseClicked(java.awt.event.MouseEvent e) {
    int row = table.rowAtPoint(e.getPoint());
    java.lang.String name = names.get(row);
    int id = ids.get(row);
    SetupReviewTable(id, name);
}