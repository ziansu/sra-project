@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    java.net.DatagramPacket dp = new java.net.DatagramPacket(data, data.length, mServerAddress, SERVER_PORT);
    try {
        mSocket.send(dp);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return null;
}