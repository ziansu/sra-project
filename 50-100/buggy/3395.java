public static void hideBrick(Brick newbrick, Ball saveBall) {
    newbrick.getBounds().setBounds((-10), (-10), 0, 0);
    newbrick.setAlive(false);
    newbrick = null;
    int saveXa = ((int) (saveBall.getXa()));
    int saveYa = ((int) (saveBall.getYa()));
    saveBall.setYa((saveYa * (-1)));
}