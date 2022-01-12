@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ((me.zaicheng.app.popularmovies.ui.base.BaseActivity) (getActivity())).activityComponent().inject(this);
    if (getArguments().containsKey(me.zaicheng.app.popularmovies.ui.detail.DetailFragment.ARG_ITEM_ID)) {
        movieId = getArguments().getLong(me.zaicheng.app.popularmovies.ui.detail.DetailFragment.ARG_ITEM_ID);
        android.util.Log.d(me.zaicheng.app.popularmovies.ui.detail.DetailFragment.TAG, ("onCreate: movie id = " + (movieId)));
    }
}