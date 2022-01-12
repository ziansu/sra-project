@java.lang.Override
public void onBindViewHolder(com.anonyxhappie.dwarf.pms2.adapters.RecyclerViewAdapter.ViewHolder holder, int position) {
    movie = mMovies.get(position);
    com.bumptech.glide.request.RequestOptions options = new com.bumptech.glide.request.RequestOptions().centerCrop().placeholder(R.drawable.loading_spinner);
    com.bumptech.glide.Glide.with(context).load(com.anonyxhappie.dwarf.pms2.network.Utils.generateImageUrl(movie.getPoster_path())).apply(options).into(holder.imageView);
}