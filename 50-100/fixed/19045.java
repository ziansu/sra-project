@org.junit.Test
public void whenSomePlayerWinByHorizontalShouldCheckThatWinCheckerReturnTrue() {
    model.WinChecker checker = new model.WinChecker();
    model.Board board = new model.Board();
    model.Player player = new model.Human("X");
    board.performStep(player, 0, 0);
    board.performStep(player, 0, 1);
    board.performStep(player, 0, 2);
    boolean actual = checker.isWinner(player, board);
    assertThat(actual, org.hamcrest.core.Is.is(true));
}