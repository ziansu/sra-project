@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    mLoadingDialog.dismiss();
    mReviews = ((java.util.ArrayList<robindarby.com.popularmovies.models.Review>) (intent.getSerializableExtra(MovieDetailsService.REVIEWS_INTENT_EXTRA)));
    mVideos = ((java.util.ArrayList<robindarby.com.popularmovies.models.Video>) (intent.getSerializableExtra(MovieDetailsService.CLIPS_INTENT_EXTRA)));
    showMovieDetails();
}