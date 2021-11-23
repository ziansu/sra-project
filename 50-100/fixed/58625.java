public void sendMessage(Message msg) {
    Packet p = new Packet(msg, sentPkts.size(), (-1), (-1));
    sentPkts.add(p);
    if (canSendNext()) {
        sendNextPacket();
    }else {
        java.lang.System.out.println(("SENDER GBN BUFFERED:  " + (msg.getMessage())));
    }
}