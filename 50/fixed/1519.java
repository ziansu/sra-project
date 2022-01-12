@org.junit.Before
public void setup() {
    testBoard = new game.PlayerBoard(game.GameBoard.User.PLAYER1, new game.TurnObserver(), null);
}