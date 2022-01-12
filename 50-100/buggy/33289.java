@java.lang.Override
public void onResponse(retrofit2.Call<com.example.karan.popularmovies.data.ReviewsJSONResponse> call, retrofit2.Response<com.example.karan.popularmovies.data.ReviewsJSONResponse> response) {
    reviews = response.body().getResults();
    if (!(reviews.isEmpty())) {
        android.support.v7.widget.RecyclerView recyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.reviews_recycler)));
        com.example.karan.popularmovies.ReviewsAdapter reviewsAdapter = new com.example.karan.popularmovies.ReviewsAdapter(reviews);
        recyclerView.setAdapter(reviewsAdapter);
        recyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getBaseContext()));
        android.util.Log.d("onResponse", "onResponse: fetch done");
    }
}