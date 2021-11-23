@Test
public void clear_clearTeams_0() {
    Team myTeam = new Team("Barbell");
    Team.clear();
    assertEquals(0, Team.all().size());
}