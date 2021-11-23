@java.lang.Override
public void onBindViewHolder(com.walmart.apps.video360app.models.VideoAdapter.MyViewHolder holder, int position) {
    com.walmart.apps.video360app.models.Video video = videos.get(position);
    holder.tvBody.setText(video.getBody());
    holder.tvTime.setText(video.getTimeFrom());
}