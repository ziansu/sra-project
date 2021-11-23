@org.junit.jupiter.api.BeforeEach
public void setup() {
    com.codecool.game.Board board = new com.codecool.game.Board();
    board.init();
    cells = board.getCells();
}