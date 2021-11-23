public pacman.game.Constants.MOVE hillClimber(pacman.game.Game game, long timeDue) {
    double currentEval = java.lang.Double.NEGATIVE_INFINITY;
    for (pacman.game.Constants.MOVE eachMove : game.getPossibleMoves(game.getPacmanCurrentNodeIndex())) {
        pacman.game.Game newState = game.copy();
        newState.advanceGame(eachMove, new pacman.controllers.examples.StarterGhosts().getMove());
        if ((eval(newState)) > currentEval) {
            myMove = eachMove;
            currentEval = eval2(newState);
        }
    }
    return myMove;
}