public boolean hasTeamFoughtInThisMatch(com.massimobono.podiliardino.model.Team t) throws java.lang.UnsupportedOperationException {
    return (this.team1.get().equals(t)) || (this.team2.get().equals(t));
}