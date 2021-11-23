@java.lang.Override
public void onClick(LTournament.client.ClickEvent event) {
    LTournament.client.GUI.setBootstrapAlert(bootstrapAlerts.tradeButtonAlert());
    LTournament.client.GUI.tournamentHandler.swapPlayers();
    LTournament.client.GUI.drawTeamTables();
}