@org.junit.Test
public void checkTest() {
    final int num = 3;
    gamelogic.Board board = new gamelogic.Board();
    java.util.ArrayList<gamelogic.Square> list = board.check();
    assertTrue(((list.size()) >= num));
}