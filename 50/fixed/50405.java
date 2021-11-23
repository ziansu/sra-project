private boolean hasPackets() {
    return ((Window_Position) < ((Packet_Buffer.size()) - 1)) && (!(Packet_Buffer.isEmpty()));
}