public static java.net.DatagramPacket convert(z21Drive.actions.Z21Action action) {
    byte[] packetContent = z21Drive.PacketConverter.toPrimitive(action.getByteRepresentation().toArray(new java.lang.Byte[0]));
    return new java.net.DatagramPacket(packetContent, action.getByteRepresentation().size());
}