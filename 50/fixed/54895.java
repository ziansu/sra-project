@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    parser.fetchJSON(getTeamFromSettings);
    while (parser.parsingComplete);
    teamEventMatches.clear();
    teamEventMatches.addAll(parser.getData());
    java.util.Collections.sort(teamEventMatches);
    return null;
}