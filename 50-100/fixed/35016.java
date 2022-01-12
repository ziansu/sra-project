@org.junit.Test
public void testCompareP2Better() {
    swissTournamentRunner.Player p1 = new swissTournamentRunner.Player("P1", 0, 0, 0, 0);
    swissTournamentRunner.Player p2 = new swissTournamentRunner.Player("P2", 1, 0, 0, 0);
    t.addPlayer("P1");
    t.addPlayer("P2");
    org.junit.Assert.assertEquals(1, p1.compareTo(p2));
}