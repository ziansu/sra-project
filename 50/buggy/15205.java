public ModelLayer.Tournament getTournamet(int tournamentID) {
    return dbTournament.getTournament(tournamentID, true);
}