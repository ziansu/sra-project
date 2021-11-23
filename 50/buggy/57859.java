public java.lang.String saveTeam() {
    teamViewBean.saveTeam();
    allTeams = teamService.findAllteams();
    return "/teams?faces-redirect=true";
}