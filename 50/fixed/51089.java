public java.lang.String getTeam() {
    return ru.ifmo.acm.mainscreen.MainScreenData.getProperties().contestInfo.getParticipant(((team) - 1)).getShortName();
}