@org.junit.Test
public void whenFigureNotFoundThenFigureNotFoundException() {
    ru.job4j.chess.Board board = new ru.job4j.chess.Board();
    boolean isExcept = false;
    try {
        board.move(board.desk[2][0], board.desk[0][2]);
    } catch (ru.job4j.chess.excepts.FigureNotFoundException fnfe) {
        isExcept = true;
    }
    org.junit.Assert.assertThat(isExcept, org.hamcrest.core.Is.is(true));
}