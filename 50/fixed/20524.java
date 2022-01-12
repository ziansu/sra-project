@butterknife.OnClick(value = R.id.fragment_movies_no_network_tv)
void tryToDownload() {
    if (isNetworkAvailable()) {
        mNoNetworkTV.setVisibility(View.GONE);
        mMoviesRV.setVisibility(View.VISIBLE);
        executeFetchMoviesTask();
        setHasOptionsMenu(true);
    }
}