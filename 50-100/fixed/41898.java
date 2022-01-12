@java.lang.Override
public void onResponse(retrofit2.Call<com.example.android.popularmovies.movies.TrailersResults> call, retrofit2.Response<com.example.android.popularmovies.movies.TrailersResults> response) {
    android.util.Log.e(com.example.android.popularmovies.DetailActivity.TAG, "looking for data trailers");
    if (!(response.isSuccessful())) {
        android.util.Log.e(com.example.android.popularmovies.DetailActivity.TAG, "Unable to connect");
        return ;
    }
    com.example.android.popularmovies.movies.TrailersResults data = response.body();
    posterAdapter.setData(((com.example.android.popularmovies.movies.TrailersResults[]) (data.getData())));
}