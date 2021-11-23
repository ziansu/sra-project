@org.junit.Test(expected = game.InvalidGameInputException.class)
public void NegativeRegisterPlayerTest() throws game.TraverseException {
    board = new edu.swe681.traverse.game.GameBoard(gameID, playerOneID, false);
    board.registerPlayerTwo((-3L));
}