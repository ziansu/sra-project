public int getOutgoingPacketOverhead() {
    return (((((1 + 4) + 4) + (handle.length())) + 8) + 4) + 4;
}