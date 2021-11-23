@java.lang.Override
public void onBindViewHolder(xyz.belvi.motion.viewmodels.holders.MovieHolder holder, final int position) {
    com.bumptech.glide.Glide.with(holder.getContext()).load(getMovie(position).getPosterPath(MoviePosterSize.w342)).into(holder.getMovieImage());
    holder.itemView.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
            movieSelected(view, getMovie(position), position);
        }
    });
    holder.getMovieImage().setContentDescription(getMovie(position).getTitle());
}