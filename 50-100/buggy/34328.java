@com.squareup.otto.Subscribe
public void handlePlaybackEvent(de.winterrettich.ninaradio.event.PlaybackEvent event) {
    if ((!(mIsInActionMode)) && (event == (de.winterrettich.ninaradio.event.PlaybackEvent.STOP))) {
        mSelector.clearSelections();
    }else {
        int selectedPosition = mSelector.getSelectedPositions().get(0);
        mAdapter.notifyItemChanged(selectedPosition);
    }
}