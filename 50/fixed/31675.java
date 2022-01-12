public void setDirection(int dir) {
    if ((dir >= 0) && (dir < (com.mygdx.game.player.Character.NUMDIRECTIONS))) {
        direction = dir;
    }
}