private void addNewPacket(java.lang.String p) throws java.io.IOException {
    if (p.startsWith("CONNECT_TO")) {
        java.lang.String[] tokens = p.split("#");
        client.addNewConnection(tokens[1], java.lang.Integer.parseInt(tokens[2]));
    }else
        if (p.startsWith("ACCEPT_NEW_CON")) {
            client.addNewConnection(s.accept());
        }else {
            packets.add(p);
            java.lang.System.out.println(("just recieved message: " + p));
        }
    
}