@org.junit.Test(expected = game.InvalidGameStateException.class)
public void IllegalQuitStateTest() throws game.TraverseException {
    board = board.playerQuit(playerOneID);
    assertEquals(new edu.swe681.traverse.game.GameState(edu.swe681.traverse.game.enums.GameStatus.FORFEIT, playerTwoID), board.getGameState());
    board.playerQuit(playerTwoID);
}