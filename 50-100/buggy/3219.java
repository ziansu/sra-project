public static void main(java.lang.String[] args) {
    swissTournamentRunner.GUI gui = new swissTournamentRunner.GUI(swissTournamentRunner.RunTourney.tourney);
    swissTournamentRunner.RunTourney.tourney.setGUI(gui);
    swissTournamentRunner.GUI.createAndShowGUI(true);
    swissTournamentRunner.RunTourney.showCredits();
    swissTournamentRunner.RunTourney.tourney.signUpPlayers();
    swissTournamentRunner.RunTourney.tourney.allParticipantsIn = true;
    swissTournamentRunner.RunTourney.tourney.run();
    swissTournamentRunner.TntFileManager.saveTournament(swissTournamentRunner.RunTourney.tourney);
    swissTournamentRunner.GUI.wipePane();
    swissTournamentRunner.RunTourney.tourney.postTourneyProcessing();
}