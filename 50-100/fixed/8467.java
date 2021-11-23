private synchronized void sendToAll(Model.Message message) {
    for (java.net.Socket c : connectedUsers.keySet()) {
        try {
            java.io.DataOutputStream dos = new java.io.DataOutputStream(c.getOutputStream());
            dos.writeUTF(message.toString());
        } catch (java.io.IOException e) {
            connectedUsers.remove(c);
            java.lang.System.out.println("Remove a user from connectedUsers collection");
        }
    }
}