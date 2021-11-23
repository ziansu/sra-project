@java.lang.Override
public void onSeekComplete(tv.danmaku.ijk.media.player.IMediaPlayer mp) {
    mSeekEndTime = java.lang.System.currentTimeMillis();
    mHudViewHolder.updateSeekCost(((mSeekEndTime) - (mSeekStartTime)));
}