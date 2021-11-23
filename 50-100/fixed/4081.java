@org.junit.Test
public void testFullSizedLevel() throws java.io.IOException {
    try (java.io.InputStream i = getClass().getResourceAsStream("/board.txt")) {
        nl.tudelft.jpacman.board.Board b = parser.parseMap(i).getBoard();
        nl.tudelft.jpacman.board.Square s1 = b.squareAt(1, 1);
        nl.tudelft.jpacman.board.Unit unit = nl.tudelft.jpacman.npc.ghost.Navigation.findNearest(nl.tudelft.jpacman.npc.ghost.Ghost.class, s1);
        org.junit.Assert.assertNotNull(unit);
    }
}