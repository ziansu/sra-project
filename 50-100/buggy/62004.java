@java.lang.Override
public void onClick(android.view.View v) {
    if (mIsTwoPane) {
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.detail_movie_container, com.example.android.popmovies.detailsActivity.MovieDetailsFragment.newInstance(mMovieItem), DETAIL_FRAGMENT).commit();
    }else {
        android.content.Intent intent = new android.content.Intent(getContext(), com.example.android.popmovies.detailsActivity.MovieDetailsActivity.class);
        intent.putExtra(com.example.android.popmovies.mainActivity.MovieListFragment.MOVIE_DETAIL_FRAGMENT_INTENT_KEY, mMovieItem);
        getActivity().startActivity(intent, android.app.ActivityOptions.makeSceneTransitionAnimation(getActivity()).toBundle());
    }
}