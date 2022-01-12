public void addTimeout(java.lang.Long timeout, java.net.DatagramPacket dp, int expectedAckNum) {
    java.lang.System.out.println(("connection.addTimeout: added timeout with expectedAckNum = " + expectedAckNum));
    timeoutList.add(timeout);
    timeoutToDatagramPacket.put(timeout, dp);
    ackNumToTimeout.put(expectedAckNum, timeout);
}