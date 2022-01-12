public static ar.com.tzulberti.archerytraining.fragments.tournament.ViewSerieInformationFragment createInstance(ar.com.tzulberti.archerytraining.model.tournament.TournamentSerie tournamentSerie) {
    ar.com.tzulberti.archerytraining.fragments.tournament.ViewSerieInformationFragment res = new ar.com.tzulberti.archerytraining.fragments.tournament.ViewSerieInformationFragment();
    res.tournamentSerie = tournamentSerie;
    return res;
}