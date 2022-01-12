private void loadRepositoryView(ch.cern.cvmfs.model.RepositoryDescription chosen) {
    ch.cern.cvmfs.listeners.RepositoryStatusListener rsl = ((ch.cern.cvmfs.listeners.RepositoryStatusListener) (getCurrentFragment(R.id.loggedin_main_right_frame)));
    rsl.repositoryChanged(chosen);
    new ch.cern.cvmfs.fragments.MainFragment.LoadNewRepository(chosen.getUrl()).execute();
}