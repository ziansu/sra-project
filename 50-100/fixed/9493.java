public void enterChatRoom(java.lang.String roomName) throws java.io.IOException {
    this.requestToServer.writeObject(new Message(MessageType.EnterTopic, null, null, roomName));
    this.requestToServer.flush();
    if ((this.enteredRoom.contains(roomName)) == false)
        this.enteredRoom.add(roomName);
    
}