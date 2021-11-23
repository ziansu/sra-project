public void playRandom() {
    int random = ((int) ((java.lang.Math.random()) * (mpSongs.size())));
    mpCurrent = getMP(random);
    playSong(mpCurrent);
    current = getSong(random);
}