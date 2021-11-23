@java.lang.Override
public void onConnectedToRoom(com.google.android.gms.games.multiplayer.realtime.Room room) {
    android.util.Log.d(com.google.example.games.bc.MainActivity.TAG, "onConnectedToRoom.");
    mParticipants = room.getParticipants();
    mMyId = room.getParticipantId(Games.Players.getCurrentPlayerId(mGoogleApiClient));
    mRoomId = room.getRoomId();
    android.util.Log.d(com.google.example.games.bc.MainActivity.TAG, ("Room ID: " + (mRoomId)));
    android.util.Log.d(com.google.example.games.bc.MainActivity.TAG, ("My ID " + (mMyId)));
    android.util.Log.d(com.google.example.games.bc.MainActivity.TAG, "<< CONNECTED TO ROOM>>");
}