@java.lang.Override
public void onClick(android.view.View view) {
    ar.com.tzulberti.archerytraining.model.tournament.TournamentSerie tournamentSerie = self.tournamentDAO.createNewSerie(self.tournament);
    if (tournamentSerie == null) {
        java.lang.System.err.println("TODO XXX PENDING: el usuario no deberia ver el boton en este caso");
        return ;
    }
    ar.com.tzulberti.archerytraining.fragments.tournament.ViewSerieInformationFragment practiceTestingFragment = ar.com.tzulberti.archerytraining.fragments.tournament.ViewSerieInformationFragment.createInstance(tournamentSerie);
    android.support.v4.app.FragmentManager fragmentManager = activity.getSupportFragmentManager();
    fragmentManager.beginTransaction().replace(R.id.container, practiceTestingFragment).commit();
}