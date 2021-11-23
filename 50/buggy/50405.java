private boolean hasPackets() {
    return ((Window_Position) < (Packet_Buffer.size())) && (!(Packet_Buffer.isEmpty()));
}