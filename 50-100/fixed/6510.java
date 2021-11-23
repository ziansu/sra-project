public void play(java.lang.String filename, android.widget.ProgressBar progressBar) throws org.mercycorps.translationcards.exception.AudioFileException {
    this.progressBar = progressBar;
    this.filename = filename;
    try {
        getAudioPlayerManager().play(this.filename);
        progressBar.setMax(getAudioPlayerManager().getMaxDuration());
        schedule();
    } catch (java.io.IOException e) {
        throw new org.mercycorps.translationcards.exception.AudioFileException(e);
    }
}