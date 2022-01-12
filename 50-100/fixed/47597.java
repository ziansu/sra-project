@java.lang.Override
public void onViewDetachedFromWindow(com.wwe.madina.wweplayer.adapters.VideosAdapter.VideoViewHolder holder) {
    if ((holder.playerView.getPlayer()) != null) {
        holder.playerView.getPlayer().stop();
        holder.playerView.getPlayer().release();
    }
    super.onViewDetachedFromWindow(holder);
}