@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (savedInstanceState != null) {
        mAuthor = savedInstanceState.getString(com.creativeflint.popularmovies.ReviewsFragment.AUTHOR_ARG);
        mContent = savedInstanceState.getString(com.creativeflint.popularmovies.ReviewsFragment.CONTENT_ARG);
    }
    if ((getArguments()) != null) {
        mAuthor = getArguments().getString(com.creativeflint.popularmovies.ReviewsFragment.AUTHOR_ARG);
        mContent = getArguments().getString(com.creativeflint.popularmovies.ReviewsFragment.CONTENT_ARG);
    }
}