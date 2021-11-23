@java.lang.Override
public void onDisconnectedFromRoom(com.google.android.gms.games.multiplayer.realtime.Room room) {
    roomId = null;
    showGameError();
    finish();
}