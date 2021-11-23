public void remove(at.eischer.model.Team teamToRemove) {
    try {
        if ((teamToRemove.getLogoPath()) != null) {
            java.nio.file.Path pathToLogo = java.nio.file.Paths.get(java.lang.System.getProperty("jboss.server.data.dir"), "logos", teamToRemove.getLogoPath());
            java.nio.file.Files.delete(pathToLogo);
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    teamService.removeTeam(teamToRemove);
    allTeams = teamService.findAllteams();
}