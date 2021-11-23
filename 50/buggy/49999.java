@java.lang.Override
public void paintComponent(java.awt.Graphics g) {
    java.awt.Graphics2D g2d = ((java.awt.Graphics2D) (g));
    super.paintComponent(g);
    reScaleImages();
    paintWorld(g2d);
    paintObjects(g2d);
    paintCars(g2d);
}