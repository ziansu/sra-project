public void sendUserObject(CardGame.User user, java.net.Socket socket) throws java.io.IOException {
    java.io.DataOutputStream toServer = new java.io.DataOutputStream(socket.getOutputStream());
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.lang.String jsonInString = gson.toJson(user);
    toServer.writeUTF(jsonInString);
    toServer.flush();
}