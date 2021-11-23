private java.util.List<int[]> pathFinder() {
    br.ol.pacman.PacmanPathFinder.getInstance().initCells(br.ol.pacman.PacmanGame.maze);
    br.ol.pacman.PacmanPathFinder.setBlocked(br.ol.pacman.PacmanGame.maze);
    br.ol.pacman.PacmanPathFinder.startI = br.ol.pacman.actor.Pacman.row;
    br.ol.pacman.PacmanPathFinder.startJ = br.ol.pacman.actor.Pacman.col;
    java.util.List<int[]> pathToFollow = br.ol.pacman.PacmanPathFinder.getInstance().returnPath();
    br.ol.pacman.actor.Pacman.donePath = true;
    return pathToFollow;
}