private void joinChatroom() throws java.lang.Exception {
    java.lang.String[] contentsAfterRequestType = this.messageReceived.split(":");
    java.lang.String[] restOfMessage = contentsAfterRequestType[1].split("\n");
    int parsedRequestedChatroomToJoin = 0;
    main.java.Chatroom chatroomAlreadyOnRecord = main.java.ChatroomServer.doesChatroomAlreadyExistByReference(parsedRequestedChatroomToJoin);
    if (chatroomAlreadyOnRecord != null) {
        chatroomAlreadyOnRecord.addClientNode(clientNode);
    }else {
        createChatroom();
    }
}