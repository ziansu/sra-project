@java.lang.Override
public void onResponse(retrofit2.Call<com.teamfingo.android.fingo.model.RandomMovie> call, retrofit2.Response<com.teamfingo.android.fingo.model.RandomMovie> response) {
    if (response.isSuccessful()) {
        com.teamfingo.android.fingo.model.RandomMovie randomMovie = response.body();
        android.util.Log.e("log", "connection success");
        for (int i = 0; i < (randomMovie.getData().size()); i++) {
            mRandomMovies.add(randomMovie.getData().get(i));
        }
        mRecyclerAdapterRandomMovie.notifyDataSetChanged();
    }
}