@org.junit.Test
public void removeDeadStonesTest1() {
    com.letitgo.Board board = new com.letitgo.Board(9);
    int firstPoint;
    int secondPoint;
    board.loadFromFile("BoardTest_a.dat");
    board.removeDeadStones(Board.ENEMY);
    firstPoint = board.getPoint(2, 6);
    secondPoint = board.getPoint(3, 6);
    org.junit.Assert.assertTrue("removeDeadStonesTest1 failed", ((firstPoint == (com.letitgo.Board.EMPTY)) && (secondPoint == (com.letitgo.Board.EMPTY))));
}