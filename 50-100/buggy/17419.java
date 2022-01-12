@java.lang.Override
public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder holder, int position) {
    {
        com.dallinwilcox.popularmovies.MovieDetailAdapter.VideoViewHolder videoView = ((com.dallinwilcox.popularmovies.MovieDetailAdapter.VideoViewHolder) (holder));
        com.dallinwilcox.popularmovies.data.Video videoAtPosition = adapterVideoList.get(position);
        com.bumptech.glide.Glide.with(videoView.videoThumbImageView.getContext()).load(videoAtPosition.getThumbnailUrl()).centerCrop().into(videoView.videoThumbImageView);
        videoView.videoName.setText(videoAtPosition.getName());
    }
}