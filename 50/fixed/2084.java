public void reset() {
    lastPicksSize = -1;
    for (com.mayhew3.drafttower.server.TeamDraftOrder team : predictionsByTeam.keySet()) {
        predictionsByTeam.get(team).clear();
    }
}