public void playLetterSound(int number) {
    pauseCurrentlyPlayingAudios();
    playSound(org.scify.memori.fx.FXAudioEngine.resourceLocator.getCorrectPathForFile(this.soundBasePath, (((letterBasePath) + number) + ".mp3")), true);
}