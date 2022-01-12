@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    if (savedInstanceState != null) {
        java.util.ArrayList<com.example.darsh.model.MovieReview> temp = savedInstanceState.getParcelableArrayList(Constants.BUNDLE_REVIEWS);
        if (temp != null) {
            movieReviews.addAll(temp);
            adapter.notifyDataSetChanged();
        }
    }else {
        loadMovieReviews();
    }
}