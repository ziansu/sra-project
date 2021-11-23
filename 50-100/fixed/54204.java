void acceptInviteToRoom(java.lang.String invId) {
    android.util.Log.d(com.seankelly001.assassin.MainActivity.TAG, ("Accepting invitation: " + invId));
    com.google.android.gms.games.multiplayer.realtime.RoomConfig.Builder roomConfigBuilder = com.google.android.gms.games.multiplayer.realtime.RoomConfig.builder(this);
    roomConfigBuilder.setInvitationIdToAccept(invId).setMessageReceivedListener(this).setRoomStatusUpdateListener(this);
    switchToScreen(R.id.screen_wait);
    keepScreenOn();
    Games.RealTimeMultiplayer.join(mGoogleApiClient, roomConfigBuilder.build());
}