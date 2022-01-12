@org.junit.Test
public void getTeams() throws org.htmlcleaner.XPatherException {
    java.util.List<org.amupoti.supermanager.parser.acb.beans.ACBSupermanagerTeam> teams = acbTeamsService.getTeamsByCredentials(org.amupoti.supermanager.parser.acb.ACBTeamServiceTest.USER, org.amupoti.supermanager.parser.acb.ACBTeamServiceTest.PASSWORD);
    org.junit.Assert.assertEquals(2, teams.size());
    org.junit.Assert.assertEquals("El Equipo 1", teams.get(0).getName());
    org.junit.Assert.assertEquals("El Equipo 2", teams.get(0).getName());
}