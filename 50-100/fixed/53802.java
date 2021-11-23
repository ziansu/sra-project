public static synchronized void createRoom(int clientID, java.lang.String roomName, java.lang.String clientName, double[] MACAddress) {
    java.lang.String key = server.Server.generateRoomKey();
    server.Server.ROOMS.put("TEST", new server.Room(roomName, clientID, clientName, MACAddress, "TEST"));
    server.Server.ROOMKEYS.put(server.Server.lastRoom, "TEST");
    (server.Server.lastRoom)++;
    packets.serverPackets.RoomKeyPacket rkp = new packets.serverPackets.RoomKeyPacket();
    rkp.putRoomKey("TEST");
    server.Server.sendPacket(clientID, rkp);
    server.Server.serverListener.setRoomKey(clientID, "TEST");
}