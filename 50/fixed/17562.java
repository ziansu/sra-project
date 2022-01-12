@org.junit.Test(expected = java.lang.IndexOutOfBoundsException.class)
public final void testgetSelectedCoordsNegative() {
    final int int1 = -9;
    final int int2 = 10;
    game.processClick(int1, int2);
}