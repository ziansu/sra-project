private void onAuthenticated() {
    mEventBus.post(new uk.org.ngo.squeezer.service.event.ConnectionChanged(ConnectionState.LOGIN_COMPLETED));
    fetchPlayers();
    sendCommandImmediately("listen 1", "can musicfolder ?", "can randomplay ?", "can favorites items ?", "can myapps items ?", "pref httpport ?", "pref jivealbumsort ?", "pref mediadirs ?", "version ?");
}