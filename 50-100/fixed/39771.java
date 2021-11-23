@java.lang.Override
public void onGetAllRoomsDone(com.shephertz.app42.gaming.multiplayer.client.events.AllRoomsEvent event) {
    roomIds = event.getRoomIds();
    android.util.Log.d(("onGetAllRoomsDone" + (roomIds)), ("onGetAllRoomsDone" + (roomIds.length)));
    if (((roomIds) != null) && ((roomIds.length) > 0)) {
        theClient.getLiveRoomInfo(roomIds[0]);
        (roomIdCounter)++;
    }
}