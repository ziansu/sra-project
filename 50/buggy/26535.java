public void sendPacket(helpers.Packet p) {
    nh.getWriter().println(p.toString());
}