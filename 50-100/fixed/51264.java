private void hideLoadingItem() {
    if ((mMovies.size()) > 0) {
        if ((mAdapter.getItemViewType(((mMovies.size()) - 1))) == (com.iamdilipkumar.movies.movies.adapters.MoviesAdapter.ITEM_TYPE_LOADING)) {
            mMovies.remove(((mMovies.size()) - 1));
            mAdapter.notifyItemRemoved(((mMovies.size()) - 1));
        }
    }
}