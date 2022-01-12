public engine.GameStateAlteration occupyLocalBoardState(int board, int space) throws engine.LocalBoardInvalidException, engine.LocalBoardSpaceAlreadyOccupiedException {
    if ((checkSpace(board, space)) != (EngineValues.EMPTY)) {
        java.lang.System.out.println("FAIL IN OCCUPY BOARD STATE GA");
        throw new engine.LocalBoardSpaceAlreadyOccupiedException(space, player, board);
    }
    if ((board != (spaceChanged)) && (!(boardIsWon(spaceChanged)))) {
        throw new engine.LocalBoardInvalidException(true, board);
    }
    return new engine.GameStateAlteration(base, this, board, space, engine.EngineValues.changePlayer(player));
}