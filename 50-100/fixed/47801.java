@java.lang.Override
public void onResponse(retrofit2.Response<com.example.android.popularmoviesstagetwo.model.ReviewListResponse> response) {
    java.util.List<com.example.android.popularmoviesstagetwo.model.Review> reviews = response.body().getResults();
    reviewAdapter.clear();
    if (reviews != null) {
        for (com.example.android.popularmoviesstagetwo.model.Review review : reviews) {
            reviewAdapter.add(review);
        }
    }
}