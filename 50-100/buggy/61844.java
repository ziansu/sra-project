@java.lang.Override
protected void onPostExecute(free.rm.skytube.businessobjects.YouTubeChannel youTubeChannel) {
    this.youTubeChannel = youTubeChannel;
    if (youTubeChannel != null) {
        com.squareup.picasso.Picasso.with(getContext()).load(youTubeChannel.getThumbnailNormalUrl()).placeholder(R.drawable.channel_thumbnail_default).into(videoDescChannelThumbnailImageView);
    }
}