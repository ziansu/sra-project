private void showGenres() {
    lwGenres = ((android.widget.ListView) (findViewById(R.id.lwGenresList)));
    java.util.ArrayList<com.briz.developer.briztv.Genre> tempGenres = new java.util.ArrayList<>();
    tempGenres.clear();
    tempGenres.add(this.getInitGenresObject());
    tempGenres.addAll(genres);
    genres.clear();
    genres.addAll(tempGenres);
    lwGenres.setAdapter(new com.briz.developer.briztv.GenresListAdapter(this, genres));
    lwGenres.setOnItemClickListener(this);
}