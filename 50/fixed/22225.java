@org.junit.Test(expected = game.InvalidGameStateException.class)
public void RegisterInIllegalStateTest() throws game.TraverseException {
    board = board.playerQuit(playerTwoID);
    board = board.registerPlayerTwo(playerTwoID);
}