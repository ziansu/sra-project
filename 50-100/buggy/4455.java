@java.lang.Override
public void gotPacket(org.pcap4j.packet.Packet packet) {
    if (packet.contains(org.pcap4j.packet.TcpPacket.class)) {
        ru.org.sarg.Dump.Conversation c = ru.org.sarg.Dump.getConversation(packet.get(org.pcap4j.packet.TcpPacket.class).getHeader().getSrcPort());
        c.add(packet);
        c.printLast();
        if (c.isFinished()) {
            c.printStats();
        }
    }
}