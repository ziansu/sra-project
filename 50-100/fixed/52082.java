public void bindView(ch.ralena.youtubelearningbuddy.object.Video video) {
    title.setText(video.getTitle());
    description.setText(video.getDescription());
    com.squareup.picasso.Picasso.with(thumbnail.getContext()).load(video.getThumbnailUrl()).fit().centerCrop().into(thumbnail);
}