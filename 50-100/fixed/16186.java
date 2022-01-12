public org.mcexchange.Packet readPacket() {
    try {
        byte b = in.readByte();
        org.mcexchange.Packet p = org.mcexchange.Packet.getPacket(b);
        p.read(in);
        return p;
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } catch (java.lang.NullPointerException e) {
        java.lang.System.err.println((("Client " + (this)) + " received an un-registered packet!"));
        java.lang.System.err.println("Kicking client...");
        disconnect();
    }
    return null;
}