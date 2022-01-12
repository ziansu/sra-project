@org.junit.Test
public void testTiedSoGoToOppWr() {
    swissTournamentRunner.Player p1 = new swissTournamentRunner.Player("P1", 3, 1, 3, 0, 0);
    swissTournamentRunner.Player p2 = new swissTournamentRunner.Player("P2", 3, 1, 0, 0, 0);
    t.addPlayer("P1");
    t.addPlayer("P2");
    org.junit.Assert.assertEquals((-1), p1.compareTo(p2));
}