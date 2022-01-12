private void createPlayer() {
    java.util.Random rnd = new java.util.Random();
    java.lang.Object[] roomIDs = rooms.keySet().toArray();
    java.lang.Object roomID = roomIDs[rnd.nextInt(roomIDs.length)];
    while (rooms.get(((int) (roomID))).isMagicRoom()) {
        roomID = roomIDs[rnd.nextInt(roomIDs.length)];
    } 
    player.setCurrentRoom(rooms.get(((int) (roomID))));
}