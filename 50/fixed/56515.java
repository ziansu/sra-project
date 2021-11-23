public void removeConnection() {
    try {
        if ((client) != null) {
            client.disconnect();
        }
    } catch (java.lang.Exception e) {
    }
}