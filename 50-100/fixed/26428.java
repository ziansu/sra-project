public void createMessageData(@com.sun.istack.internal.NotNull
byte[] data, java.lang.String receiver) {
    if (tcpMap.containsKey(receiver)) {
        tcpMap.get(receiver).createMessageData(data);
    }else {
        tcpMap.put(receiver, new TCPLayer.TCPStream(receiver));
        tcpMap.get(receiver).createMessageData(data);
        tcpMap.get(receiver).establishConnection();
    }
}