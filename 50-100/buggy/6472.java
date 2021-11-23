@org.junit.Test
public void testCreateTurnObserver() throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.NoSuchFieldException, java.lang.SecurityException {
    game.ITurnObserver observer = new game.TurnObserver();
    game.GameBoard board = new game.GameBoard(game.GameBoard.User.PLAYER1, pieces);
    board.setObserver(observer);
    java.lang.reflect.Field privateObserverField = game.GameBoard.class.getDeclaredField("observer");
    privateObserverField.setAccessible(true);
    game.ITurnObserver fieldValue = ((game.ITurnObserver) (privateObserverField.get(board)));
    assertTrue((fieldValue != null));
}