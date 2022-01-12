public void cleanRoomStateMap() {
    for (java.util.Map.Entry<java.lang.String, org.cubyte.edumon.client.RoomState> entry : roomStateMap.entrySet()) {
        if (entry.getValue().isOutdated()) {
            roomStateMap.remove(entry.getKey());
        }
    }
}