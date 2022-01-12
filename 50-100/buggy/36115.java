@org.junit.Test
public void testCompareIdenticalPlayersIsTie() {
    swissTournamentRunner.Player p1 = new swissTournamentRunner.Player("P1", 0, 0, 0, 0, 0);
    swissTournamentRunner.Player p2 = new swissTournamentRunner.Player("P2", 0, 0, 0, 0, 0);
    t.addPlayer(p1);
    t.addPlayer(p2);
    org.junit.Assert.assertEquals(0, p1.compareTo(p2));
}