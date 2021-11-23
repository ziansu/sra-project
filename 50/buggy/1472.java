public void disconnect() {
    if ((client) != null) {
        client.close();
        client = null;
    }
}