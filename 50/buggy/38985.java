@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    android.util.Log.d(getClass().toString(), "Failed to fetch reviews");
    reviewTextView.setText(getResources().getString(R.string.no_reviews));
}