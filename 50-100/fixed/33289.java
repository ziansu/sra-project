@java.lang.Override
public void onResponse(retrofit2.Call<com.example.karan.popularmovies.data.ReviewsJSONResponse> call, retrofit2.Response<com.example.karan.popularmovies.data.ReviewsJSONResponse> response) {
    reviews = response.body().getResults();
    if (!(reviews.isEmpty())) {
        com.example.karan.popularmovies.ReviewsAdapter reviewsAdapter = new com.example.karan.popularmovies.ReviewsAdapter(reviews);
        recyclerView.setAdapter(reviewsAdapter);
        android.util.Log.d("onResponse", "onResponse: fetch done");
    }
}