public boolean isGameOver(Maze_Setup.Maze maze) {
    if (party.isDefeated()) {
        gameOver = true;
        return gameOver;
    }else
        if (foundExit(maze)) {
            gameOver = true;
            java.lang.System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            java.lang.System.out.println("\n CONGRATULATIONS!\n");
            java.lang.System.out.println(" you found the exit and won the game!\n");
            credits();
            java.lang.System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            return gameOver;
        }
    
    return !(maze.mazeTraversal());
}