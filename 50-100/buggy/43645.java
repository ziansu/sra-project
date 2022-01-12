public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    if (((point1) != null) && ((obj) != null)) {
        shape.draw(g);
    }
    if (!(list.isEmpty())) {
        for (Shape s : list) {
            s.draw(g);
        }
    }
}