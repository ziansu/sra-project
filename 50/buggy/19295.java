public static ar.com.tzulberti.archerytraining.fragments.tournament.ViewSerieInformationFragment createInstance(ar.com.tzulberti.archerytraining.model.tournament.TournamentSerie tournamentSerie, boolean creatingSerie) {
    ar.com.tzulberti.archerytraining.fragments.tournament.ViewSerieInformationFragment res = new ar.com.tzulberti.archerytraining.fragments.tournament.ViewSerieInformationFragment();
    res.tournamentSerie = tournamentSerie;
    res.creatingSerie = creatingSerie;
    return res;
}