@java.lang.Override
public void onBindViewHolder(arturvasilov.udacity.nanodegree.popularmoviesdatabinding.widget.MoviesAdapter.ViewHolder holder, int position) {
    super.onBindViewHolder(holder, position);
    arturvasilov.udacity.nanodegree.popularmoviesdatabinding.model.Movie movie = getItem(position);
    arturvasilov.udacity.nanodegree.popularmoviesdatabinding.utils.Images.loadMovie(holder.mImageView, movie, Images.WIDTH_185);
    arturvasilov.udacity.nanodegree.popularmoviesdatabinding.utils.Images.fetch(movie.getPosterPath(), Images.WIDTH_780);
}