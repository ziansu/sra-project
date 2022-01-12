@java.lang.Override
public void connect() {
    if ((isConnected) == false) {
        try {
            isConnected = true;
            sock = new java.net.Socket(ipAddress, port);
            in = new java.io.DataInputStream(sock.getInputStream());
            out = new java.io.DataOutputStream(sock.getOutputStream());
        } catch (java.io.IOException e) {
            isConnected = false;
            log.Log.Log((((("TCPConnection to " + (ipAddress)) + " on port ") + (port)) + " failed."), LogLevel.INFO);
        }
    }
}