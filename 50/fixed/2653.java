private void changeSort(java.lang.String sort) {
    m_SortType = sort;
    if (isOnline()) {
        new br.com.deyvidjlira.popularmovies.ui.fragments.BrowserMoviesActivityFragment.FetchMoviesTask(this).execute(m_SortType);
    }
}