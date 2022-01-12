public void removeCastPlayer() {
    castPlayer.removePlayer();
    castPlayer.setPlayerCallback(null);
    castPlayer.setPlayerListener(null);
    castPlayer = null;
}