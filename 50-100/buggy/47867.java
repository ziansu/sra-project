@java.lang.Override
public void onResponse(retrofit2.Call<com.nabwera.filamuapp.model.MoviesResponse> call, retrofit2.Response<com.nabwera.filamuapp.model.MoviesResponse> response) {
    java.util.List<com.nabwera.filamuapp.model.Movie> movies = response.body().getResults();
    recyclerView.setAdapter(new com.nabwera.filamuapp.adapter.MoviesAdapter(getApplicationContext(), movies));
    recyclerView.smoothScrollToPosition(0);
    if (swipeContainer.isRefreshing()) {
        swipeContainer.setRefreshing(false);
    }
    pd.dismiss();
}