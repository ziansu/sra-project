@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    byte[] data = new byte[]{ joyControl , joyState };
    java.net.DatagramPacket dp = new java.net.DatagramPacket(data, data.length, mServerAddress, SERVER_PORT);
    try {
        mSocket.send(dp);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return null;
}