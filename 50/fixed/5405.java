public void paint(java.awt.Graphics g) {
    comm.Packet data = getPacket("192.168.0.11");
    g.drawString(data.toString(), 0, 0);
}