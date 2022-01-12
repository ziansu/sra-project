@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    final android.view.View view = inflater.inflate(R.layout.movie_detail_view, container, false);
    mUnbinder = butterknife.ButterKnife.bind(this, view);
    if ((getArguments()) != null) {
        android.os.Bundle bundle = getArguments();
        mMovieId = bundle.getInt(MovieViewHolderPortrait.MOVIEID_KEY, (-1));
        timber.log.Timber.d("movieId: %d", mMovieId);
    }
    return view;
}