public ModelLayer.Tournament getTournament(int tournamentID) {
    return dbTournament.getTournament(tournamentID, true);
}