public static void hideBrick(Brick newbrick, Ball saveBall) {
    newbrick.getBounds().setBounds((-10), (-10), 0, 0);
    newbrick.setAlive(false);
    newbrick = null;
    double saveXa = saveBall.getXa();
    double saveYa = saveBall.getYa();
    saveBall.setYa((saveYa * (-1)));
}