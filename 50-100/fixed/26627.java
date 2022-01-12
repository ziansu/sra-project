@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent e) {
    mouse_coordinates[0] = e.getX();
    mouse_coordinates[1] = e.getY();
    obj.relasedPoint = obj.dmo_calculate.calculateIntersection(mouse_coordinates, BoardSize, StartPoint, distance);
    obj.gameboard[obj.relasedPoint[0]][obj.relasedPoint[1]] = com.GO.PLACE.BLACK;
    obj.update();
}