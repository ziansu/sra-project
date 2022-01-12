static double determineAverageScore(pacman.controllers.Controller<pacman.game.Constants.MOVE> pacManController, pacman.controllers.Controller<java.util.EnumMap<pacman.game.Constants.GHOST, pacman.game.Constants.MOVE>> ghostController) {
    double totalScore = 0;
    for (int i = 0; i < (CoevolutionResultEvaluator.NUM_OF_GAMES_TO_RUN_PER_GENERATION); i++) {
        pacman.Executor executor = new pacman.Executor(false, true);
        double score = ((double) (executor.runGame(pacManController, ghostController, false, 0)));
        totalScore += score;
    }
    return totalScore / 10.0;
}