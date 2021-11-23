public void pulse() {
    int nameLength = session.getName().length();
    packet.Pulse pulse = new packet.Pulse(nameLength, session.getName(), session.getExperienceTracker().getCurrentLevel());
    packet.Packet packet = new packet.Packet(session.getID(), 0, session.getNextSeqNumber(), Payload.PULSE, pulse);
    session.getConnection().getSender().send(packet);
}