public void play(java.lang.String filename, android.widget.ProgressBar progressBar) throws org.mercycorps.translationcards.exception.AudioFileException {
    this.progressBar = progressBar;
    try {
        getAudioPlayerManager().play(filename);
        progressBar.setMax(getAudioPlayerManager().getMaxDuration());
        schedule();
    } catch (java.io.IOException e) {
        throw new org.mercycorps.translationcards.exception.AudioFileException(e);
    }
}