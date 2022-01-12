@org.junit.Test
public void whenMoveThenMoved() {
    ru.job4j.chess.Board board = new ru.job4j.chess.Board();
    board.addFigure(new ru.job4j.chess.Bishop(board.desk[2][0], "white", board));
    board.fillBoard();
    org.junit.Assert.assertThat(board.move(board.desk[2][0], board.desk[0][2]), org.hamcrest.core.Is.is(true));
}