@java.lang.Override
public void updatePlaying() {
    if ((game.checkCollision(this, br.ol.pacman.actor.Pacman.class)) != null) {
        visible = false;
        (game.currentFoodCount)--;
        game.addScore(10);
        br.ol.pacman.actor.Pacman.donePath = false;
        br.ol.pacman.PacmanPathFinder.endI = -1;
        br.ol.pacman.PacmanPathFinder.endJ = -1;
        br.ol.pacman.PacmanGame.maze[row][col] = 0;
    }
}