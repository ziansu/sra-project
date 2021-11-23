@Test
public void singletonBoardHaveOneQueen() {
    Session aSession = new Session(new board.SingletonBoard());
    assertEquals("[1, 1]", aSession.eval());
}