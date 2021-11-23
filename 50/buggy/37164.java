private void loadTeams() {
    if ((this.competitionId) >= 0)
        com.ygsoftware.football.manager.footballmanager.ui.controllers.TeamsController.getInstance().getTeams(this.competitionId);
    
}