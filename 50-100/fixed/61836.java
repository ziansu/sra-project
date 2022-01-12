@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    java.util.ArrayList<com.example.darsh.model.MovieReview> temp = null;
    if (savedInstanceState != null) {
        temp = savedInstanceState.getParcelableArrayList(Constants.BUNDLE_REVIEWS);
    }
    if (temp != null) {
        movieReviews.addAll(temp);
        adapter.notifyDataSetChanged();
    }else {
        loadMovieReviews();
    }
}