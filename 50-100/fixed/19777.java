public java.util.EnumMap<pacman.game.Constants.GHOST, pacman.game.Constants.MOVE> getMove(pacman.game.Game game, long timeDue) {
    for (pacman.game.Constants.GHOST ghostType : pacman.game.Constants.GHOST.values())
        if (game.doesGhostRequireAction(ghostType))
            moves.put(ghostType, allMoves[rnd.nextInt(allMoves.length)]);
        
    
    return moves;
}