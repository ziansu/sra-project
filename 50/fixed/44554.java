@org.junit.Test
public void testFindPositionList10s() {
    final java.util.List<edu.luc.cs.cs271.lab2.Team> list = makeListFixture(10);
    assertTrue(edu.luc.cs.cs271.lab2.Search.findTeamPosition(list, "Team 7").isPresent());
}