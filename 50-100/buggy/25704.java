@java.lang.Override
public void onResponse(@android.support.annotation.NonNull
retrofit2.Call<com.app.phedev.popmovie.pojo.TrailerResponse> call, @android.support.annotation.NonNull
retrofit2.Response<com.app.phedev.popmovie.pojo.TrailerResponse> response) {
    java.util.List<com.app.phedev.popmovie.pojo.Trailer> trailers = response.body().getResults();
    recyclerView1.setAdapter(new com.app.phedev.popmovie.adapter.TrailerAdapter(getApplicationContext(), trailers));
    recyclerView1.smoothScrollToPosition(0);
    trailerAdapter.notifyDataSetChanged();
}