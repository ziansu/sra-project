public void sendMessage(java.lang.String roomName, java.lang.String sender, java.lang.String content) throws java.io.IOException {
    if ((this.enteredRoom.contains(roomName)) == false) {
        java.lang.System.out.println(("Not in the room: " + roomName));
        return ;
    }
    this.requestToServer.writeObject(new Message(MessageType.ToTopic, content, roomName, sender));
    this.requestToServer.flush();
}