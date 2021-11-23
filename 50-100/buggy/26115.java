@java.lang.Override
public void run() {
    if ((mAdapter) == null) {
        mAdapter = new br.net.paulofernando.moviest.adapters.CollectionsAdapter(collections, this.getContext());
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
        mRecyclerView.setVisibility(View.VISIBLE);
    }else {
        mAdapter.addMovies(collections);
    }
    loadingTextView.setVisibility(View.GONE);
}