void chatWithServer(android.bluetooth.BluetoothSocket sock) {
    byte[] buf = new byte[1024];
    try {
        sock.getInputStream().read(buf);
        sock.getOutputStream().write("[Client] Hai.".getBytes());
        toast((("[Client] server said: `" + (new java.lang.String(buf))) + "'"));
        sock.close();
    } catch (java.io.IOException e) {
        toast("[Client] error sending/receiving data.");
    }
}