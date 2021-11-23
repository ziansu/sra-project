@org.junit.Test
public void testTakeTerritoryWithTwo() {
    board.changeTroops(alaska, 0);
    board.changeTroops(alberta, 100);
    board.setFaction(alaska, Colors.PINK);
    board.setFaction(alberta, Colors.BLACK);
    board.attack(alberta, alaska, 2);
    assertSame(Colors.BLACK, board.getFaction(alaska));
    assertSame(2, board.getTroops(alaska));
}