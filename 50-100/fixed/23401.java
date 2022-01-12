private synchronized void sendTo(Model.Message message, java.net.Socket c) {
    try {
        java.io.DataOutputStream dos = new java.io.DataOutputStream(c.getOutputStream());
        dos.writeUTF(message.toString());
    } catch (java.io.IOException e) {
        connectedUsers.remove(c);
        java.lang.System.out.println("Remove a user from connectedUsers collection");
    }
}