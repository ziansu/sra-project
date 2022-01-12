@Test
public void singletonBoardHaveOneQueen() {
    Session aSession = new Session(board.SingletonBoard.count(1));
    assertEquals("[1, 1]", aSession.eval());
}