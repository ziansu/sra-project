@java.lang.SuppressWarnings(value = "static-access")
@java.lang.Override
public void mousePressed(java.awt.event.MouseEvent e) {
    for (int i = 0; i < (game.TourManager.numberOfPacks()); i++) {
        path = map.findPath(player.getX(), player.getY(), tour.getPack(i).getX(), tour.getPack(i).getY());
        player.followPath(path);
    }
}