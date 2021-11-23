public void sendUserObject(java.lang.String userName, java.lang.String password, java.lang.String firstName, java.lang.String lastName, java.net.Socket socket) throws java.io.IOException {
    java.io.DataOutputStream toServer = new java.io.DataOutputStream(socket.getOutputStream());
    CardGame.User user = new CardGame.User(userName, password, firstName, lastName);
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.lang.String jsonInString = gson.toJson(user);
    toServer.writeUTF(jsonInString);
    toServer.flush();
}