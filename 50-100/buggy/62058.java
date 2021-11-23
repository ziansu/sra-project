@java.lang.Override
public void onPacketSending(com.comphenix.protocol.events.PacketEvent e) {
    try {
        com.comphenix.protocol.events.PacketContainer p = e.getPacket();
        if ((e.getPlayer().getEntityId()) != (p.getIntegers().read(0))) {
            p.getShorts().write(0, ((short) (420)));
        }
    } catch (com.comphenix.protocol.reflect.FieldAccessException exception) {
        exception.printStackTrace();
    }
}