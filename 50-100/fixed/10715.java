public void eliminationTournament() {
    while ((players.size()) > 1) {
        swissTournamentRunner.GUI.wipePane();
        shufflePlayers();
        sortRankings();
        updateParticipantStats();
        print(displayInDepthRankings());
        generatePairings(0);
        pollForResults();
        elimination();
    } 
}