public void moveWindow(int packetAckNum) {
    int nextPacketSeqNum = (windowSize) + packetAckNum;
    java.lang.System.out.println((("Marking packet " + packetAckNum) + " as status code of 3"));
    packetStatusCode.add(nextPacketSeqNum, 3);
    java.lang.System.out.println(("Placing status code of 1 for packet " + nextPacketSeqNum));
    currentWindow.remove(0);
    java.lang.System.out.println((("Removing packet " + packetAckNum) + " from current window"));
}