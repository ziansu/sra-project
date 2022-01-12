@org.junit.Test(expected = java.lang.IndexOutOfBoundsException.class)
public final void testgetSelectedCoordsToBig() {
    final int int1 = 9;
    game.processClick(int1, 0);
}