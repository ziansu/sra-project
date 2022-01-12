public java.util.List<java.util.List<java.lang.Integer>> move(java.util.List<java.util.List<java.lang.Integer>> firstPlayerPositions, java.util.List<java.util.List<java.lang.Integer>> secondPlayerPositions) throws com.blackship.battlesheep.game.state.exceptions.WrongStateException {
    gameState = gameState.changeState(firstPlayerPositions, secondPlayerPositions);
    java.util.List<java.util.List<java.lang.Integer>> shotPositions = gameState.shotPositions();
    com.blackship.battlesheep.game.Game.log.info("Positions to shoot from the first player: %s", firstPlayerPositions);
    com.blackship.battlesheep.game.Game.log.info("Positions to shoot from the second player: %s", secondPlayerPositions);
    com.blackship.battlesheep.game.Game.log.info("Positions shot: %s", shotPositions);
    return shotPositions;
}