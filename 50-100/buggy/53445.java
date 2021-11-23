@org.junit.Test
public void testCantMovePieceOfOtherColor() {
    main.java.Model model = new main.java.Model();
    main.java.Position currPosition = null;
    main.java.Position newPosition = null;
    try {
        currPosition = new main.java.Position(1, 0);
        newPosition = new main.java.Position(2, 0);
    } catch (main.java.InvalidPositionException ex) {
        test.java.ModelTest.logger.error(ex.getMessage());
    }
    model.movePiece(currPosition, newPosition);
    org.junit.Assert.assertTrue(((model.getExceptionThrown()) instanceof java.lang.IllegalArgumentException));
}