public void showCanPlayList(boolean canPlay) {
    if (canPlay != (showCanBePlayed)) {
        showCanBePlayed = canPlay;
        loadNewRecords();
    }
}