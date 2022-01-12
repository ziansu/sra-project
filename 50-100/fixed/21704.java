@org.junit.Test
public void testTakeTerritory() {
    board.changeTroops(alaska, 0);
    board.changeTroops(alberta, 100);
    board.setFaction(alaska, Colors.PINK);
    board.setFaction(alberta, Colors.BLACK);
    board.attack(alberta, alaska);
    assertSame(Colors.BLACK, board.getFaction(alaska));
    assertSame(3, board.getTroops(alaska));
}