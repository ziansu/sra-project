@java.lang.Override
public void onBindViewHolder(com.example.android.moviemagazine.MovieAdapter.ViewHolder holder, int position) {
    com.squareup.picasso.Picasso.with(context).load(dummyData.toString()).into(holder.MovieImageView);
}