private void onAuthenticated() {
    fetchPlayers();
    sendCommandImmediately("listen 1", "can musicfolder ?", "can randomplay ?", "can favorites items ?", "can myapps items ?", "pref httpport ?", "pref jivealbumsort ?", "pref mediadirs ?", "version ?");
}