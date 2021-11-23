@org.junit.Test
public void shouldHave40Squares() {
    java.util.List<com.monopoly.Square> squares = game.getSquares();
    assertEquals(40, squares.size());
}