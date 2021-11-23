@java.lang.Override
public void removeItemFavorite(int position, com.framgia.moviedb.data.model.Movie movie) {
    if (mType.equals(Constant.IntentKey.EXTRA_FAVORITE)) {
        mVerticalMovieAdapter.deleteItem(position);
        if ((mVerticalMovieAdapter.getItemCount()) == 0) {
            mMoviesBinding.textMessageNoItem.setVisibility(View.VISIBLE);
        }
    }
}