@java.lang.Override
public void run() {
    while (!(connexionClose)) {
        byte[] buffer = new byte[client.ClientInputSocket.MAX_LENGHT];
        try {
            java.io.InputStream input = socket.getInputStream();
            input.read(buffer);
        } catch (java.io.IOException e) {
            connexionClose = true;
            java.lang.System.out.println(e);
        }
        java.lang.String stringReceived = new java.lang.String(buffer);
        java.lang.System.out.println(stringReceived);
    } 
}