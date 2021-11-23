public TCPLayer.TCPMessage createMessageData(@com.sun.istack.internal.NotNull
byte[] data, java.lang.String receiver) {
    if (tcpMap.containsKey(receiver)) {
        tcpMap.get(receiver).createMessageData(data);
        return null;
    }else {
        tcpMap.put(receiver, new TCPLayer.TCPStream(receiver));
        tcpMap.get(receiver).createMessageData(data);
        return tcpMap.get(receiver).establishConnection();
    }
}