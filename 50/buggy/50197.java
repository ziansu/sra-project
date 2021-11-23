public void sendServerMessage(java.lang.String msg) throws java.io.IOException {
    for (java.io.ObjectOutputStream output : outputs) {
        output.writeObject(("\n" + msg));
        output.flush();
    }
    showLocalMessage(msg);
}