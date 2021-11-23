public static void main(java.lang.String[] args) {
    main.java.entrants.pacman.neethu.controllers.BFSPacMan bfs = new main.java.entrants.pacman.neethu.controllers.BFSPacMan();
    main.java.entrants.pacman.neethu.controllers.AStarPacMan astar = new main.java.entrants.pacman.neethu.controllers.AStarPacMan();
    main.java.Main.ghosts = new main.java.examples.commGhosts.POCommGhosts(50);
    main.java.Main.randomGhosts = new pacman.controllers.examples.RandomGhosts();
    pacman.Executor executor = new pacman.Executor(false, true);
    executor.runGameTimed(bfs, main.java.Main.ghosts, true);
}