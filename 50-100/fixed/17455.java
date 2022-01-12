@java.lang.Override
public void removeItemFavorite(int position, com.framgia.moviedb.data.model.Movie movie) {
    if (mType.equals(Constant.IntentKey.EXTRA_FAVORITE)) {
        mVerticalMovieAdapter.get().deleteItem(position);
        if ((mVerticalMovieAdapter.get().getItemCount()) == 0) {
            mMoviesBinding.textMessageNoItem.setVisibility(View.VISIBLE);
        }
    }
}