public void addTimeout(java.lang.Long timeout, java.net.DatagramPacket dp, int expectedAckNum) {
    timeoutList.add(timeout);
    timeoutToDatagramPacket.put(timeout, dp);
    ackNumToTimeout.put(expectedAckNum, timeout);
}