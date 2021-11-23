public java.lang.String waitForInitialMessage() {
    do {
        try {
            username = connection.getInputStream().readUTF();
        } catch (java.io.IOException ex) {
        }
    } while ((username) == null );
    return username;
}