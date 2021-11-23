public void paint(java.awt.Graphics g) {
    g.setFont(java.awt.Font.SANS_SERIF);
    comm.Packet data = getPacket("192.168.0.11");
    g.drawString(data.toString(), 0, 0);
}