@java.lang.Override
public void onViewDetachedFromWindow(com.wwe.madina.wweplayer.adapters.VideosAdapter.VideoViewHolder holder) {
    com.wwe.madina.wweplayer.models.Video video = videoList.get(holder.getAdapterPosition());
    if ((video.getPlaybackUrl()) != null) {
        holder.playerView.getPlayer().stop();
        holder.playerView.getPlayer().release();
    }
    super.onViewDetachedFromWindow(holder);
}