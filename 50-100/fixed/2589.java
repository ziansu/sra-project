@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    teamEventParser.fetchJSON(eventKey, getContext());
    while (teamEventParser.parsingComplete);
    teams.clear();
    teams.addAll(teamEventParser.getTeams());
    java.util.Collections.sort(teams);
    rankParser.fetchJSON(eventKey, getContext());
    while (rankParser.parsingComplete);
    ranks.clear();
    ranks.addAll(rankParser.getRankings());
    return null;
}