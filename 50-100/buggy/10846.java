public void sendMessage(java.lang.String desintationUser, java.lang.String body, java.lang.String message) {
    Controller.Message newMessage = new Controller.Message(this.currentUser.getUsername(), desintationUser, body, message);
    messageManager.init();
    messageManager.addData(newMessage);
    messageManager.closeConnection();
}