private void initMoviesGrid() {
    adapter = new me.maxdev.popularmoviesapp.ui.movies.MoviesAdapter(getContext(), null);
    adapter.setOnItemClickListener(this);
    recyclerView.setAdapter(adapter);
    recyclerView.setItemAnimator(new android.support.v7.widget.DefaultItemAnimator());
    int columns = getResources().getInteger(R.integer.movies_columns);
    recyclerView.addItemDecoration(new me.maxdev.popularmoviesapp.ui.ItemOffsetDecoration(getActivity(), R.dimen.movie_item_offset));
    recyclerView.setLayoutManager(new android.support.v7.widget.GridLayoutManager(getActivity(), columns));
}