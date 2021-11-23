@java.lang.Override
public void onBindViewHolder(com.teamtreehouse.movienight.adapters.MoviesAdapter.MoviesViewHolder holder, int position) {
    holder.bindMovie(mMovies.get(position));
}