public int selectRow(java.awt.event.MouseEvent e) {
    int selected_row = -1;
    java.awt.Point p = e.getPoint();
    java.awt.FontMetrics fm = right_page.getFontMetrics(right_page.getFont());
    selected_row = ((p.y) / (fm.getHeight())) + 1;
    return selected_row;
}