public void remove(long teamId) {
    at.eischer.model.Team teamToRemove = teamService.findTeamById(teamId);
    try {
        java.nio.file.Path pathToLogo = java.nio.file.Paths.get(java.lang.System.getProperty("jboss.server.data.dir"), "logos", teamToRemove.getLogoPath());
        java.nio.file.Files.delete(pathToLogo);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    teamService.removeTeam(teamId);
    allTeams = teamService.findAllteams();
}