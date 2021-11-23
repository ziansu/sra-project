public void sendPacket(helpers.Packet p) {
    nh.getWriter().println(p.toString());
    java.lang.System.out.println(p.toString());
}