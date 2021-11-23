private void hideLoadingItem() {
    if (mLoadMore) {
        if (((mAdapter.getItemViewType(((mMovies.size()) - 1))) == (com.iamdilipkumar.movies.movies.adapters.MoviesAdapter.ITEM_TYPE_LOADING)) && ((mMovies.size()) > 0)) {
            mMovies.remove(((mMovies.size()) - 1));
            mAdapter.notifyItemRemoved(mMovies.size());
        }
    }
}