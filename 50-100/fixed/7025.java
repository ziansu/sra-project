private void startQuickGame() {
    final int MIN_OPPONENTS = 1;
    final int MAX_OPPONENTS = 1;
    android.os.Bundle autoMatchCriteria = com.google.android.gms.games.multiplayer.realtime.RoomConfig.createAutoMatchCriteria(MIN_OPPONENTS, MAX_OPPONENTS, 0);
    com.google.android.gms.games.multiplayer.realtime.RoomConfig.Builder rtmConfigBuilder = com.google.android.gms.games.multiplayer.realtime.RoomConfig.builder(this);
    rtmConfigBuilder.setMessageReceivedListener(this);
    rtmConfigBuilder.setRoomStatusUpdateListener(this);
    rtmConfigBuilder.setAutoMatchCriteria(autoMatchCriteria);
    switchToScreen(R.id.screen_wait);
    keepScreenOn();
    Games.RealTimeMultiplayer.create(mGoogleApiClient, rtmConfigBuilder.build());
}