@java.lang.Override
protected void onComplete(retrofit2.Call<java.util.List<br.com.clairtonluz.moviemanagerapp.favorite.Favorite>> call, boolean success) {
    super.onComplete(call, success);
    if (movieList.isEmpty()) {
        noContent.setVisibility(View.VISIBLE);
    }else {
        noContent.setVisibility(View.GONE);
    }
}