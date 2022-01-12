@java.lang.Override
public java.util.List<de.dhbw.persistence.Match> getMatches() {
    java.util.List<de.dhbw.persistence.Match> matches = new java.util.ArrayList<>();
    if (this.matches.isEmpty()) {
        return matches;
    }
    for (java.lang.String matchId : this.matches.split(";")) {
        long id = java.lang.Long.parseLong(matchId);
        de.dhbw.persistence.Match match = DependecyKnowItAll.matchRepository.getMatchById(id);
        matches.add(match);
    }
    return matches;
}