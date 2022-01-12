private void sendNextPacket() {
    Packet toSend = new Packet(packetArrayList.get(nextSeqNum));
    java.lang.System.out.println(("SENDER GBN SENDING:     " + (toSend.toString())));
    nl.sendPacket(toSend, to);
    if ((base) == (nextSeqNum)) {
        tl.stopTimer(me);
        tl.startTimer(timeOut, me);
    }
    (numTransmissions)++;
    (nextSeqNum)++;
}