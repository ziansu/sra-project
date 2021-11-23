public void run() {
    java.lang.System.out.print(("Inside timer thread for: " + (sequenceNumber)));
    java.lang.System.out.println((". " + (java.lang.System.currentTimeMillis())));
    if (TestSimpleFTPClientData.receivedACK.contains(sequenceNumber)) {
        java.lang.System.out.println("Packet received within time");
    }else {
        java.lang.System.out.println(("Packet timed out: " + (sequenceNumber)));
        TestSimpleFTPClientData.timedOutPackets.add(sequenceNumber);
    }
}