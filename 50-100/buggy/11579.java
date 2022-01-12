@java.lang.Override
protected synchronized void onProgressUpdate(java.lang.Void... values) {
    if ((SoundActivity.seekBar) != null) {
        SoundActivity.seekBar.setMax(org.gtlp.yasb.SoundActivity.soundPlayerInstance.getDuration());
        SoundActivity.seekBar.setProgress(org.gtlp.yasb.SoundActivity.soundPlayerInstance.getCurrentPosition());
    }
    if ((SoundActivity.timeText) != null) {
        SoundActivity.timeText.setText(SoundActivity.soundPlayerInstance.getFormattedProgressText());
    }
}