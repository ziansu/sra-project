@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    rankParser.fetchJSON(eventKey, getContext());
    while (rankParser.parsingComplete);
    ranks.clear();
    ranks.addAll(rankParser.getRankings());
    teamEventParser.fetchJSON(eventKey, getContext());
    while (teamEventParser.parsingComplete);
    teams.clear();
    teams.addAll(teamEventParser.getTeams());
    java.util.Collections.sort(teams);
    return null;
}