@java.lang.Override
public void run() {
    playPauseButton.setImageResource(R.drawable.uamp_ic_pause_white_48dp);
    android.support.v7.widget.RecyclerView.ViewHolder viewHolder = recyclerView.findViewHolderForAdapterPosition(trackPosNr);
    if ((recyclerView.isAttachedToWindow()) && (viewHolder != null)) {
        try {
            currentMediaListItemView = viewHolder.itemView;
            if ((previousMediaListItemView) != null) {
                resetDrawablesOnPlay();
            }
            if ((currentMediaListItemView) != null) {
                setDrawablesOnPlay();
            }
        } catch (java.lang.Exception ex) {
            android.util.Log.e(ch.zhaw.bait17.audio_signal_processing_toolbox.ui.AudioPlayerFragment.TAG, ex.getMessage());
        }
    }
}