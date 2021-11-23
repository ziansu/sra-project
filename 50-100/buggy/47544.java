private void updateQueuePosition() {
    if ((ch.blinkenlights.android.vanilla.PlaybackService.finishAction(mState)) == (SongTimeline.FINISH_RANDOM)) {
        mQueuePosView.setText(null);
    }else {
        ch.blinkenlights.android.vanilla.PlaybackService service = ch.blinkenlights.android.vanilla.PlaybackService.get(this);
        mQueuePosView.setText(((((service.getTimelinePosition()) + 1) + "/") + (service.getTimelineLength())));
    }
    mInfoTable.requestLayout();
}