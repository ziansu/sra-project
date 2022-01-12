private void animatePacman(final long timeStart, objectsPackage.Pacman pacman) {
    if ((contactListener.isCollidingWithWall()) && (pacman.isColliding())) {
        pacman.setOpenPacman();
    }else {
        double time = ((java.lang.System.currentTimeMillis()) - timeStart) / 1000.0;
        pacman.animatePacman(time);
    }
}