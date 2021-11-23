public void next(android.view.View view) {
    if ((currenSongNumber) < ((currentDirAllFiles.length) - 1)) {
        (currenSongNumber)++;
        startPlaying(currenSongNumber);
    }
}