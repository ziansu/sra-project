@java.lang.Override
public void run() {
    if ((mAdapter) == null) {
        mAdapter = new br.net.paulofernando.moviest.adapters.CollectionsAdapter(this.getContext());
        mAdapter.addMovies(collections);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setVisibility(View.VISIBLE);
    }else {
        mAdapter.addMovies(collections);
    }
    loadingTextView.setVisibility(View.GONE);
}