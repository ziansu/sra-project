@java.lang.Override
public void onClick(android.view.View view) {
    if ((mMovieDetail) != null) {
        mUserFavoriteViewModel.deleteMovieById(mMovieId);
    }
}