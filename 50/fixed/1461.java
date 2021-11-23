public void addRoomState(java.lang.String sessionId, org.cubyte.edumon.client.messaging.messagebody.NameList nameList) {
    roomStateMap.put(room, new org.cubyte.edumon.client.RoomState(sessionId, nameList));
}