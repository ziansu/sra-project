public void sendKey(int client, int directive, byte[] subKey) {
    try {
        chatServerClients.get(client).sendKey(directive, subKey);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}