@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    adapter = new com.vezikon.popularmovies.views.adapters.MoviesAdapter(getActivity(), moviesList);
    mGridView.setAdapter(adapter);
    mGridView.setOnItemClickListener(this);
    if (isEmpty) {
        if (com.vezikon.popularmovies.Utils.isNetworkAvailable(getActivity())) {
            showProgress(true);
            getMovies(com.vezikon.popularmovies.fragments.MoviesFragment.TYPE_MOST_POPULAR);
        }else {
            android.widget.Toast.makeText(getActivity(), getString(R.string.error_msg_no_connection), Toast.LENGTH_LONG).show();
        }
    }
}