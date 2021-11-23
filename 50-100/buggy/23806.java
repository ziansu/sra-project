void oscEvent(org.tom.aavs.OscMessage msg) {
    java.lang.String adr = msg.address();
    if ((msg.checkAddrPattern("/active")) == true) {
        int a = msg.get(0).intValue();
        activeClient = a == 1;
    }else
        if (msg.checkAddrPattern("/play")) {
            java.lang.String filename = msg.get(0).stringValue();
            localMovie = new org.tom.aavs.Movie(this, filename);
        }
    
}