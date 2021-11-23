@org.junit.Test
public void hashCodeTest() {
    main.java.group37.bejeweled.board.Tile tile = new main.java.group37.bejeweled.board.Tile(1, 1);
    tile.setIndex(2);
    main.java.group37.bejeweled.board.Tile tile2 = new main.java.group37.bejeweled.board.Tile(1, 1);
    tile2.setIndex(2);
    java.lang.System.out.println();
    assertTrue(((tile.hashCode()) == (tile2.hashCode())));
}