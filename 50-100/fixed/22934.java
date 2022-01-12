public void setWatchlistAdapter() {
    if ((baseWatchlistAdapter.getItemCount()) == 0) {
        baseWatchlistRecyclerView.setVisibility(View.GONE);
        emptyListTextView.setVisibility(View.VISIBLE);
        emptyListTextView.setText(R.string.noMoviesOnWatchList);
    }else {
        baseWatchlistRecyclerView.setVisibility(View.VISIBLE);
        emptyListTextView.setVisibility(View.GONE);
    }
}