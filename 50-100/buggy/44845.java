static synchronized void logMessage(int level, java.lang.String prefix, java.lang.String message) {
    de.blinkt.openvpn.OpenVPN.logbuffer.addLast(((prefix + " ") + message));
    if ((de.blinkt.openvpn.OpenVPN.logbuffer.size()) > (de.blinkt.openvpn.OpenVPN.MAXLOGENTRIES))
        de.blinkt.openvpn.OpenVPN.logbuffer.removeFirst();
    
    if ((((de.blinkt.openvpn.OpenVPN.counter)++) % 50) == 0) {
        java.lang.System.gc();
    }
    for (de.blinkt.openvpn.OpenVPN.LogListener ll : de.blinkt.openvpn.OpenVPN.logListener) {
        ll.newLog(((prefix + "  ") + message));
    }
}