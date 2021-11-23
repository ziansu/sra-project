@org.junit.Test(expected = game.InvalidGameInputException.class)
public void InvalidPlayerIDQuitTest() throws game.TraverseException {
    board = board.playerQuit(5L);
}