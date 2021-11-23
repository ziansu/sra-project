public void addMovies(java.util.List<sg.assignment.shopback.moviediscovery.data.realm.Movie> movies) {
    if ((movies == null) || ((movies.size()) == 0))
        return ;
    
    int position = allMovies.size();
    allMovies.addAll(movies);
    notifyItemRangeInserted(position, movies.size());
}