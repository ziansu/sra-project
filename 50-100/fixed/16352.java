private void createPlayer() {
    java.util.Random rnd = new java.util.Random();
    java.lang.Integer[] roomIDs = rooms.keySet().toArray(new java.lang.Integer[0]);
    java.lang.Integer roomID = roomIDs[rnd.nextInt(roomIDs.length)];
    while (rooms.get(roomID).isMagicRoom()) {
        roomID = roomIDs[rnd.nextInt(roomIDs.length)];
    } 
    player.setCurrentRoom(rooms.get(roomID));
}