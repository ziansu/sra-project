@org.junit.Test
public void getTeamTest() {
    backend.Team team2 = new backend.Team("F2", "User", 2500000, engine, aerodynamicist, mechanic, strategist);
    team2.setPointsThisSeason(1);
    this.season.addTeam(team2);
    assertEquals(team2, this.season.getTeam(0));
}