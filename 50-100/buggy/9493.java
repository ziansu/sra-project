public void enterChatRoom(java.lang.String roomName) throws java.io.IOException {
    this.requestToServer.writeObject(new Message(MessageType.EnterTopic, roomName, null, null));
    this.requestToServer.flush();
    if ((this.enteredRoom.contains(roomName)) == false)
        this.enteredRoom.add(roomName);
    
}