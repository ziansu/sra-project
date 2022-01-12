public int selectRow(java.awt.event.MouseEvent e) {
    int selected_row = -1;
    java.awt.Point p = e.getPoint();
    java.lang.System.out.println(((("Manowitz left page(x,y): " + (p.x)) + ", ") + (p.y)));
    java.awt.FontMetrics fm = right_page.getFontMetrics(right_page.getFont());
    selected_row = ((p.y) / (fm.getHeight())) + 1;
    return selected_row;
}