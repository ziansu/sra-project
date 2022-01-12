public void click(java.awt.Component c) {
    if ((robot) != null) {
        java.awt.Point point = c.getLocation();
        javax.swing.SwingUtilities.convertPointToScreen(point, c);
        robot.mouseMove(point.x, point.y);
        robot.mousePress(java.awt.event.InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(java.awt.event.InputEvent.BUTTON1_DOWN_MASK);
    }
}