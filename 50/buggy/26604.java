private void sendUdpBeacon() {
    try {
        udp.send(beacon.getBuffer());
    } catch (java.io.IOException ex) {
        java.lang.System.err.println("E: Unable to send UDP beacon");
        if (verbose) {
            ex.printStackTrace();
        }
    }
}