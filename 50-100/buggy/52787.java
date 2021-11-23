@java.lang.Override
public void onItemSelected(android.os.Bundle bundle) {
    if (mTwoPane) {
        android.os.Bundle args = new android.os.Bundle();
        args.putParcelable(getString(R.string.movies_parcel), bundle);
        com.ahmedtikiwa.popularmovies.fragments.MovieDetailFragment movieDetailFragment = new com.ahmedtikiwa.popularmovies.fragments.MovieDetailFragment();
        movieDetailFragment.setArguments(args);
        getSupportFragmentManager().beginTransaction().replace(R.id.movie_detail_container, movieDetailFragment, com.ahmedtikiwa.popularmovies.activities.MainActivity.MOVIE_DETAIL_FRAGMENT_TAG).commit();
    }else {
        android.content.Intent movieDetail = new android.content.Intent(this, com.ahmedtikiwa.popularmovies.activities.MovieDetailActivity.class).putExtras(bundle);
        startActivity(movieDetail);
    }
}