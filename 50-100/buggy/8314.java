@org.junit.Test
public void whenSomePlayerWinByDiagonalShouldCheckThatCheckerReturnTrue() {
    model.WinChecker checker = new model.WinChecker();
    model.Board board = new model.Board();
    model.Player player = new model.Human("X");
    boolean expected = true;
    board.performStep(player, 0, 0);
    board.performStep(player, 1, 1);
    board.performStep(player, 2, 2);
    boolean actual = checker.isWinner(player, board);
    assertThat(actual, org.hamcrest.core.Is.is(expected));
}