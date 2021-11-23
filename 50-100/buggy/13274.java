@java.lang.Override
public void mouseDragged(java.awt.event.MouseEvent e) {
    obj.drawIntersection = true;
    java.lang.System.out.println("I am reactiong!");
    mouse_coordinates[0] = e.getX();
    java.lang.System.out.println(mouse_coordinates[0]);
    mouse_coordinates[1] = e.getY();
    obj.intersectionPoint = obj.dmo_calculate.calculateIntersection(mouse_coordinates, BoardSize, StartPoint, distance);
    obj.update();
}