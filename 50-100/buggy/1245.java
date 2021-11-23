public void mouseClick(java.awt.Point p) {
    java.lang.System.out.println("trying to move");
    robot.mouseMove(((int) (p.getX())), ((int) (p.getY())));
    mouseClick();
    robot.mouseMove(pointMatrix[org.randac.Application.CENTER].x, pointMatrix[org.randac.Application.CENTER].y);
}