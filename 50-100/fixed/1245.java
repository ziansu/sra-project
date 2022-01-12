public void mouseClick(java.awt.Point p) throws java.lang.NullPointerException {
    int x = ((int) (p.getX()));
    int y = ((int) (p.getY()));
    robot.mouseMove(x, y);
    mouseClick();
}