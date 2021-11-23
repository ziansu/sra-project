@java.lang.Override
public void paint(java.awt.Graphics g) {
    super.paint(g);
    java.awt.Graphics2D g2d = org.teachingextensions.windows.ProgramWindow.configureGraphics2D(g);
    paintLines(g2d);
    paintTurtle(g2d);
    g2d.dispose();
}