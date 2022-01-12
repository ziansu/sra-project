@org.junit.Test
public void containsSpecialGemTrueTest() {
    main.java.group37.bejeweled.combination.Combination x1 = combinationMaker();
    java.util.List<main.java.group37.bejeweled.board.Tile> tiles = x1.getTiles();
    main.java.group37.bejeweled.board.Tile a1 = new main.java.group37.bejeweled.board.FlameTile(1, 4);
    tiles.add(a1);
    org.junit.Assert.assertEquals(x1.containsSpecialGem(), true);
}