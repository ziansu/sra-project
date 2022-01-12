private void getTournamentData(java.lang.String tournamentName) {
    CtrLayer.TournamentController tournamentController = new CtrLayer.TournamentController();
    java.util.ArrayList<ModelLayer.Tournament> tournaments = tournamentController.getTournaments();
    boolean found = false;
    for (int i = 0; (!found) || (i < (tournaments.size())); i++) {
        if ((tournaments.get(i).getName()) == tournamentName) {
            tournamnent = tournaments.get(i);
        }
    }
}