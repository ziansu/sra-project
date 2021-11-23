@org.junit.Test
public void checkTest() {
    gamelogic.Board board = new gamelogic.Board();
    java.util.ArrayList<gamelogic.Square> list = board.check();
    assertTrue(((list.size()) >= 3));
}