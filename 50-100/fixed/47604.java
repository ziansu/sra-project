@java.lang.Override
public void run() {
    playPauseButton.setImageResource(R.drawable.uamp_ic_pause_white_48dp);
    android.support.v7.widget.RecyclerView.ViewHolder viewHolder = recyclerView.findViewHolderForAdapterPosition(trackPosNr);
    if ((recyclerView.isAttachedToWindow()) && (viewHolder != null)) {
        currentMediaListItemView = viewHolder.itemView;
        if ((previousMediaListItemView) != null) {
            resetDrawablesOnPlay();
        }
        if ((currentMediaListItemView) != null) {
            setDrawablesOnPlay();
        }
    }
}