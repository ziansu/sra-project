@java.lang.Override
public void onViewDetachedFromWindow(org.bottiger.podcast.activities.feedview.EpisodeViewHolder holder) {
    org.bottiger.podcast.SoundWaves.getBus().unregister(holder.mPlayPauseButton);
    super.onViewDetachedFromWindow(holder);
}