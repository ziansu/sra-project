@org.junit.Before
public void setup() {
    observer = new tests.TestBoardObserver.MockBoardObserver();
    testBoard = new game.PlayerBoard(game.GameBoard.User.PLAYER1, new game.TurnObserver(), observer);
    pieces = new game.AbstractPiece[10][4];
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 10; j++) {
            pieces[j][i] = game.PieceFactory.createClearPiece();
        }
    }
}