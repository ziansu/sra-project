void eliminationTournament() {
    while ((players.size()) > 1) {
        swissTournamentRunner.GUI.wipePane();
        shufflePlayers();
        sortRankings();
        updateParticipantStats();
        print(displayInDepthRankings());
        generatePairings();
        pollForResults();
        elimination();
    } 
}