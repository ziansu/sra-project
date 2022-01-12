public void playNumSound(int number) {
    pauseCurrentlyPlayingAudios();
    playSound((((numBasePath) + (java.lang.String.valueOf(number))) + ".mp3"), true);
}