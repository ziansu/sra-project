private void refreshScreen() {
    swissTournamentRunner.GUI.wipePane();
    updateParticipantStats();
    print(displayInDepthRankings());
    print();
    print();
}