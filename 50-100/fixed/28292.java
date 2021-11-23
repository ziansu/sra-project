private void resetRecording() {
    if ((mAudioTimeLabelUpdater) != null) {
        mAudioTimeLabelUpdater.stop();
        mAudioTimeLabelUpdater = null;
    }
    mRecordTimeInterval = 0;
    mRecordingTime.setText("00:00");
    ((android.widget.ImageButton) (findViewById(R.id.toggleRecord))).setImageResource(R.drawable.ic_play);
}