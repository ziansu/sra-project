@java.lang.Override
public com.example.android.popularmovies.fragments.MovieListFragment getItem(int position) {
    switch (position) {
        case 0 :
            return mPopularFrag;
        case 1 :
            return mTopRatedFrag;
        case 2 :
            return mFavoritesFrag;
        default :
            return mPopularFrag;
    }
}