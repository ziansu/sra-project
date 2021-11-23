@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent me) {
    core.Coordinate nearest = map.getMapLogic().getNearestRoom(((int) (getMousePosition().getX())), ((int) (getMousePosition().getY())));
    if ((ralyCoordinates.size()) > 1) {
        ralyCoordinates = new java.util.ArrayList<>();
    }
    ralyCoordinates.add(nearest);
    repaint();
}