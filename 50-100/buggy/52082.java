public void bindView(ch.ralena.youtubelearningbuddy.object.Video video) {
    title.setText(video.getTitle());
    description.setText(video.getDescription());
    android.util.Log.d("asdf", video.getThumbnailUrl());
    com.squareup.picasso.Picasso.with(thumbnail.getContext()).load(video.getThumbnailUrl()).fit().centerCrop().into(thumbnail);
}