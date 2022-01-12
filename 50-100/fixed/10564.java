public void afterPropertiesSet() throws java.lang.Exception {
    int roundId = getRoundId();
    if (roundId < 1) {
        return ;
    }
    round = org.powertac.tournament.beans.Round.getRoundFromId(roundId, false);
    loadRoundInfo();
    loadParticipantInfo();
    loadCsvLinks();
    loadMaps();
}