@org.junit.Test(expected = java.lang.IndexOutOfBoundsException.class)
public final void testgetSelectedCoordsNegative() {
    gamelogic.Game game = new gamelogic.Game();
    game.start();
    final int int1 = -9;
    final int int2 = 10;
    game.processClick(int1, int2);
    game.stop();
}