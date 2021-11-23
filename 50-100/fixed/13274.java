@java.lang.Override
public void mouseDragged(java.awt.event.MouseEvent e) {
    obj.drawIntersection = true;
    mouse_coordinates[0] = e.getX();
    mouse_coordinates[1] = e.getY();
    obj.intersectionPoint = obj.dmo_calculate.calculateIntersection(mouse_coordinates, BoardSize, StartPoint, distance);
    obj.update();
}