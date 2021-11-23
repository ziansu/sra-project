public void shootRope() {
    if (!(Driver.game.getCurrentLevel().hasRope())) {
        int ropeY = (Driver.game.getCurrentLevel().getHeight()) - (height);
        int ropeX = (x) + ((width) / 2);
        game.Rope rope = new game.Rope(ropeX, ropeY);
        Driver.game.getCurrentLevel().setRope(rope);
    }
}