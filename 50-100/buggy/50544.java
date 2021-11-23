public void addAll(java.util.ArrayList<com.example.android.popmovies.MovieInfo> movies) {
    for (int i = 0; i < (movies.size()); i++) {
        moviesInfo.add(movies.get(i));
    }
    this.notifyItemRangeInserted(0, ((moviesInfo.size()) - 1));
}