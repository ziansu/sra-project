@java.lang.Override
public void mousePressed(java.awt.event.MouseEvent e) {
    java.awt.Point p = e.getPoint();
    for (Plane plane : planes) {
        if (plane.contains(p)) {
            if ((current) != null) {
                current.setActive(false);
            }
            current = plane;
            current.setActive(true);
            refresh();
        }
    }
}