@java.lang.Override
protected synchronized void onProgressUpdate(java.lang.Void... values) {
    if ((org.gtlp.yasb.SoundActivity.soundPlayerInstance.get()) != null) {
        if ((SoundActivity.seekBar) != null) {
            SoundActivity.seekBar.setMax(org.gtlp.yasb.SoundActivity.soundPlayerInstance.get().getDuration());
            SoundActivity.seekBar.setProgress(org.gtlp.yasb.SoundActivity.soundPlayerInstance.get().getCurrentPosition());
        }
        if ((SoundActivity.timeText) != null) {
            SoundActivity.timeText.setText(SoundActivity.soundPlayerInstance.get().getFormattedProgressText());
        }
    }
}