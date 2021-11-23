public boolean create(edu.ycp.cs320.groupProject.model.Chatroom c, edu.ycp.cs320.groupProject.model.User u) {
    boolean success = false;
    boolean nameTaken = false;
    java.util.List<edu.ycp.cs320.groupProject.model.Chatroom> listOfChatrooms = db.selectAllChatrooms();
    for (edu.ycp.cs320.groupProject.model.Chatroom room : listOfChatrooms) {
        if (room.getChatroomName().equals(c.getChatroomName())) {
            nameTaken = true;
            break;
        }
    }
    if (nameTaken == true) {
        java.lang.System.out.println("Chatroom name already taken!");
    }else {
        db.createChatroom(c, u);
        success = true;
    }
    return success;
}