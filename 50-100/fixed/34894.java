@java.lang.SuppressWarnings(value = "static-access")
@java.lang.Override
public void mousePressed(java.awt.event.MouseEvent e) {
    path = map.findPath(player.getX(), player.getY(), tour.getPack(0).getX(), tour.getPack(0).getY());
    player.followPath(path);
}