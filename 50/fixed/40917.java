private void setTeam(java.lang.String t) {
    team = t;
    if (team.startsWith("R")) {
        teamEnum = Link.RESISTANCE;
    }
    if (team.startsWith("E")) {
        teamEnum = Link.ENLIGHTENED;
    }
}