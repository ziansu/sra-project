public void queueMessage(com.algaroth.core.net.packet.Packet arg1) {
    synchronized(queuedPackets) {
        java.lang.System.out.println("Queing Packet");
        queuedPackets.add(arg1);
    }
}