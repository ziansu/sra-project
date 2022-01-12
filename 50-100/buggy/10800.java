public void sendPacket(org.mcexchange.Packet p) {
    try {
        byte id = org.mcexchange.Packet.getId(p);
        out.writeByte(id);
        p.write(out);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } catch (java.lang.NullPointerException e) {
        java.lang.System.out.println((("Tried to send an unregistered packet to Client " + (this)) + "!"));
        disconnect();
    }
}