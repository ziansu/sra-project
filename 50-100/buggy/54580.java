public static java.net.DatagramPacket convert(z21Drive.actions.Z21Action action) {
    byte[] packetContent = z21Drive.PacketConverter.toPrimitive(((java.lang.Byte[]) (action.getByteRepresentation().toArray())));
    return new java.net.DatagramPacket(packetContent, action.getByteRepresentation().size());
}