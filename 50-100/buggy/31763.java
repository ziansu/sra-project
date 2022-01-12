private void sendSyslogMessage(java.lang.StringBuilder msg) {
    if ((ds) == null)
        return ;
    
    byte[] msgData = msg.toString().getBytes(java.nio.charset.StandardCharsets.US_ASCII);
    try {
        ds.send(new java.net.DatagramPacket(msgData, msgData.length));
    } catch (java.io.IOException e) {
        ds.close();
        ds = null;
    }
}