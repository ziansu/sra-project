public void playRandom() {
    int random = 0;
    do {
        random = ((int) ((java.lang.Math.random()) * (mpSongs.size())));
    } while ((index) == random );
    index = random;
    current = getSong(index);
    mpCurrent = getMP(index);
    playSong(mpCurrent);
}