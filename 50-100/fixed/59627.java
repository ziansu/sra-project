public void sendToARoom(java.lang.Object msg, java.lang.String room) {
    java.lang.String message = ((java.lang.String) (msg));
    server.Room tempRoom = roomList.getRoom(room);
    if (!(tempRoom.equals(null))) {
        for (int r = 0; r < (tempRoom.size()); r++) {
            tryToSendToClient(message, tempRoom.get(r));
        }
    }else {
        java.lang.System.out.println("Couldn't find room, not sending message.");
    }
}