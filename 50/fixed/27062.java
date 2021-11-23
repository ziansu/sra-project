void showWaitingRoom(com.google.android.gms.games.multiplayer.realtime.Room room) {
    android.util.Log.e("#####", "F: SHOW WAITING ROOM");
    android.content.Intent intent = Games.RealTimeMultiplayer.getWaitingRoomIntent(mGoogleApiClient, room, ((com.seankelly001.assassin.MainActivity.MIN_PLAYERS) + 1));
    mRoom = room;
    startActivityForResult(intent, com.seankelly001.assassin.MainActivity.RC_WAITING_ROOM);
}