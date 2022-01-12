@java.lang.Override
public void onResponse(retrofit2.Call<me.leofontes.movies.Models.ReviewCatalog> call, retrofit2.Response<me.leofontes.movies.Models.ReviewCatalog> response) {
    if (!(response.isSuccessful())) {
        android.util.Log.i(me.leofontes.movies.Fragments.MovieDetailActivityFragment.TAG, ("Erro: " + (response.code())));
    }else {
        reviewCatalog = response.body();
        reviewRecyclerView = ((android.support.v7.widget.RecyclerView) (rootview.findViewById(R.id.recyclerview_reviews)));
        me.leofontes.movies.Adapters.ReviewAdapter reviewAdapter = new me.leofontes.movies.Adapters.ReviewAdapter(reviewCatalog.results);
        reviewRecyclerView.setAdapter(reviewAdapter);
    }
}