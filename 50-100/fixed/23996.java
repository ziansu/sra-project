public static void send(client.Message msg) throws java.lang.Exception {
    try {
        java.net.Socket connection = new java.net.Socket(general.Settings.URL, general.Settings.PORT);
        java.io.ObjectOutputStream output = new java.io.ObjectOutputStream(connection.getOutputStream());
        output.writeObject(msg);
        output.close();
        connection.close();
    } catch (java.lang.Exception e) {
        throw new java.lang.Exception(("Error sending message to the server! " + (e.getStackTrace())));
    }
}